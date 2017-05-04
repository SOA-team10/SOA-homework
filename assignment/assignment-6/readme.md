亲爱的老师/助教:

以下是assignment-6的说明

1. 配置服务器，运行web项目，浏览器中访问"/sender?id=141250033"
即可完成修改的SOAP请求的发送，并在浏览器中接收到返回学号为141250033的学生的成绩情况, 此处为了便于模拟出错的情况，会在请求参数中动态输入id

2. src/MsgSender 是客户端，负责SOAP消息的封装和发送

3. src/MsgReceiver 是服务端，负责接收SOAP消息，并解析和处理，最终返回SOAP-response
 
4. 为便于参考，作业中附带了运行时截图，请参阅 
  - runtime_1.png 正常发送请求的响应
  - runtime_2.png 出现错误时的响应