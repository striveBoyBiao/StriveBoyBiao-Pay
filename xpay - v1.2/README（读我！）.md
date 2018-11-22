# XPay个人收款支付系统

> 基于Java开发 新手请先百度Spring Boot教程

### XPay原理流程见 https://github.com/Exrick/xpay

### v1.2升级原理说明
- 创建多张同金额不同备注的收款码，支付时挨个递增选取，实现订单支付标识，添加的越多，越能实现多人短时间内同时支付。
    - 配置二维码数量数在`application.properties`中修改，二维码配置在`src\main\resources\static\assets\qr`文件内，具体支付宝支付为"alipay"文件夹，"1.00元"分为单个"1.00"文件夹，其中多个图片命名由"1"递增，订单备注需和"1"相同或者设置为你能识别对应的，图格式为".png"，图片数不得少于你在`application.properties`中配置的
- 自定义金额收款需用户输入系统自动生成的四位数随机码，实现订单支付标识，图片名为"custom.png"
- 一键打开支付宝App配置（支持安卓浏览器、不支持微信）
    - 将生成的支付宝收款码解析链接后放入href即可 例如：HTTPS://QR.ALIPAY.COM/FKX05348YGHADA5W9JJV66，具体见下面
    - `<a href='HTTPS://QR.ALIPAY.COM/FKX05348YGHADA5W9JJV66' target='_blank'>一键打开支付宝APP支付</a>`
    - 具体页面中取链接配置参考`alipay.html`页面js代码

### 本地开发运行部署
- 依赖：[Redis](https://github.com/Exrick/xmall/blob/master/study/Redis.md)(必须)
- 新建`xpay`数据库，已开启自动生成数据库表，运行项目后即自动创建，也可以导入sql文件
- 在 `application.properties` 中修改你的配置，例如端口、数据库、Redis、邮箱配置等，其中有详细注释
- 运行 `XpayApplication.java`
- 访问默认端口8888：http://localhost:8888

### Linux后台运行示例
`nohup java -jar xpay-1.0-SNAPSHOT.jar -Xmx128m &`

### 技术疑问交流
- 给作者项目Star(限Github)或捐赠后可加入交流群 `475743731`，还可免费共享学习资源和 [UI框架](https://github.com/Exrick/xmall/blob/master/study/FlatLab.md) [![](http://pub.idqqimg.com/wpa/images/group.png)](http://shang.qq.com/wpa/qunwpa?idkey=7b60cec12ba93ebed7568b0a63f22e6e034c0d1df33125ac43ed753342ec6ce7)
- 作者博客：[http://blog.exrick.cn](http://blog.exrick.cn)
### 捐赠
![](http://p77xsahe9.bkt.clouddn.com/18-7-20/54731550.jpg)

![](http://p77xsahe9.bkt.clouddn.com/18-6-28/32845239.jpg)

