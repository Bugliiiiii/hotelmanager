# 酒店管理系统

1. 使用方法：

在使用前，需要到`druid.properties` 配置文件中，修改自己对应于自己数据库的属性；如用户名，密码等

```properties
driverClassName=com.mysql.cj.jdbc.Driver
url=jdbc:mysql:///hotel?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC
username=root
password=123456
# 初始化连接数量
initialSize=5
# 最大连接数
maxActive=10
# 最大等待时间
maxWait=3000
```

注意：如果是保持数据库连接异常，则说明数据库和jar包版本匹配了，注意升级数据库jar包版本；



2. 本项目主要是基于Swing框架搭建的java桌面应用程序	在项目中主要实现的功能有：

   - 开始界面为动态代码雨的欢迎效果

     ![](https://github.com/liuxingzhumeng/hotel-management/blob/master/show/1.png)

   - 美化后的自定义按钮和编码登录界面，登录界面主要实现了最小化功能和区分管理员和用户登录的设置功能；也有记住账户密码的效果

     ![](https://github.com/liuxingzhumeng/hotel-management/blob/master/show/2.png)

   - 注册界面。实现了验证码的生成和验证，以及出生日期的日历控件化的选择，当用户注册成功后，用户名密码就会通过方法传到登录界面从而避免了用户第二次填账号密码的麻烦

     ![](https://github.com/liuxingzhumeng/hotel-management/blob/master/show/3.png)

   - 登录主要分为管理员登录和用户登录，管理员登录后有

     - 客房管理功能：这个功能主要实现了对房间的增删改查，以及查看对应房间的评论等；涉及到了多对多的查询

       ![](https://github.com/liuxingzhumeng/hotel-management/blob/master/show/4.png)

     - 用户管理功能：主要的增删改查操作，点击对应的用户右边小框框展示用户的头像

       ![](https://github.com/liuxingzhumeng/hotel-management/blob/master/show/5.png)

     - 订单管理功能：在这里会展示用户的全部订单，通过多对多的查询展示用户的订房信息等；已经对用户的一些信息进行统计；主要用到了ifreechart 框架进行绘制表格

       ![](https://github.com/liuxingzhumeng/hotel-management/blob/master/show/6.png)

     - 客房服务功能：就是给房间添加一些新的设备以及多张配图，方便用户浏览

       ![](https://github.com/liuxingzhumeng/hotel-management/blob/master/show/7.png)

     - 历史记录：主要记录用户的订房退房记录，实现这个功能主要用到mysql的触发器，通过触发器，没删除一个订单，就将对于的订单保存到历史记录表里边；最后导出表格，而我导出的表格用csv文件逗号阵列，比较方便生成

       ![](https://github.com/liuxingzhumeng/hotel-management/blob/master/show/8.png)

     - 管理员管理，主要是设置权限的1位超级管理员0 为普通管理员

       ![](https://github.com/liuxingzhumeng/hotel-management/blob/master/show/9.png)

   - 在退出前会有监听事件，会询问用户是否最小化托盘，如果最小化托盘则项目已经在运行中

   - 在登录前，由于想模仿QQ登录功能输入对应的账号显示不同的头像，最后添加了键盘监听功能和数据库查询，所以刚开始会有点卡

   - 用户登录功能

     - 用户登录后，可以查看房间和其各种资料；

       ![](https://github.com/liuxingzhumeng/hotel-management/blob/master/show/10.png)

     - 用户也可以点评房间

       ![](https://github.com/liuxingzhumeng/hotel-management/blob/master/show/11.png)

     - 用户可以对客房进行预订，如果金额不足之前则需要用户进行充值

     - 而充值界面需要用户点击我的头像那里进入个人信息页面

       ![](https://github.com/liuxingzhumeng/hotel-management/blob/master/show/12.png)

     - 用户个人信息还有评论记录都可以在个人信息这里修改删除等

3. 文件夹目录说明

   ```
   image    主要用于保存项目中用到的图片文件的
   lib      主要用于保存用项目中用到jar包
   sql      整个项目运行的数据和数据库表
   src      全部源码
   	com.ludashen.control  主要保存各种自定义的控件的
   	com.ludashen.dao      数据库交互代码
   	com.ludashen.frame    用户交互界面代码
   	com.ludashen.hothl    模型对象类
   	com.ludashen.panel    面板容器
   resource  资源文件，图片等
   druid.properties 数据库配置文件
   ```

   

4. 代码的具体作用

    由于当初我做项目时还要其他组员，考虑到他们可能看不懂，所以基本上每个方法我都写了注释了，具体用来做什么的。
