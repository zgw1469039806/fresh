package org.fresh.gd.commons.consts.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.fresh.gd.commons.consts.consts.Consts;



@NoArgsConstructor
@Data
public class ResponseData<T> {

    private int code = Consts.Result.SUCCESS.getCode();

    private String msg = Consts.Result.SUCCESS.getMsg();

    private T data;

    public ResponseData(T data)
    {
        this.data = data;
    }
}
