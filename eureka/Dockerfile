FROM java:8
#复制文件到容器
ADD eureka-1.0-SNAPSHOT.jar /app.jar
RUN bash -c 'app.jar'
#暴露的端口
EXPOSE 8761
#配置执行命令
ENTRYPOINT ["java","-jar","/app.jar"]



