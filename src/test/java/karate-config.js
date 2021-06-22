function fn() {   
    //获取系统配置
   var env = karate.env; 
   karate.log('karate.env system property was:', env);
   if (!env) {
     env = 'dev'; //默认启动配置
   }
    //基础配置信息，可以在全局使用
   var config = {
     someUrlBase: 'http://127.0.0.1:5000/',
   };
   if (env == 'stage') {
     //可以根据环境启动重新配置文件中的配置
     config.someUrlBase = 'http://127.0.0.1:5000/';
   } else if (env == 'e2e') {
     config.someUrlBase = 'http://127.0.0.1:5000/';
   }
   //一些链接超时时间设置
   karate.configure('connectTimeout', 5000);
   karate.configure('readTimeout', 5000);
   return config;
 }