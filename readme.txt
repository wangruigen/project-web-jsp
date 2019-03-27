1.查看配置文件application.yml,查看11行，dev是开发环境配置，prod是生产环境配置，区别
只是数据库的区别。
2.启动项目,如果是dev环境配置，控制台访问http://localhost:9999/project-web/h2-console/,
输入用户名和密码登录数据库，然后进入h2控制台执行sql命令，基本的sql命令在resource.h2db目录下sql.sql文件。
3.访问项目首页

基础篇：https://github.com/wangruigen/springboot-study