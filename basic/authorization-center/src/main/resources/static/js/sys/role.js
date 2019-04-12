layui.use('table', function () {
    var $ = layui.$;
    var table = layui.table;
    var form = layui.form;
    var tableResult = table.render({
        elem: '#role'
        , height: 'full-200'
        , cellMinWidth: 80
        , url: '/queryRoles'
        , cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
        , cols: [[
            {field: 'id', width: 80, title: '角色编号', sort: true}
            , {field: 'roleName', width: 280, title: '角色名'}
            , {field: 'roleDesc', width: 380, title: '描述', sort: true}
            , {field: 'stat', width: 80, title: '状态'}
            , {field: 'lock', title: '是否禁用', width: 110, templet: '#checkboxTpl', unresize: true}
            , {fixed: 'right', width: 165, align: 'center', toolbar: '#barDemo'}
        ]]
        , page: true
    });

    //监听锁定操作
    form.on('checkbox(lockDemo)', function (obj) {
        layer.tips(this.value + ' ' + this.name + '：' + obj.elem.checked, obj.othis);
    });

    //监听行工具事件
    table.on('tool(test)', function (obj) {
        var data = obj.data;
        //console.log(obj)
        if (obj.event === 'del') {
            layer.confirm('真的删除行么', function (index) {
                obj.del();
                layer.close(index);
            });
        } else if (obj.event === 'edit') {
            layer.prompt({
                formType: 2
                , value: data.email
            }, function (value, index) {
                obj.update({
                    email: value
                });
                layer.close(index);
            });
        }
    });

    $("#_search").click(function () {
        var roleName = $("#_rolename").val();
        tableResult.reload({
            where: {
                roleName: roleName

            }, page: {
                curr: 1 //重新从第 1 页开始
            }
        })
    });


});

