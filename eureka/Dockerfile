FROM java:8
#将本地文件挂载到容器
VOLUME /emp

#复制文件到容器
ADD eureka-1.0-SNAPSHOT.jar /app.jar

RUN bash -c 'app.jar'
#暴露的端口
EXPOSE 8761
#配置执行命令
ENTRYPOINT ["java","-Djava.security.egh=file:/dev/./urandom","-jar","/app.jar"]



