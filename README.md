## 1.结构说明

前端参考代码： 项目前端的参考代码，基于此前端开发

电子商务书记词典：数据库设计表

电子商务系统需求分析：项目的完成目标



## 2.设计说明

本系统采用前后端分离的方式实现，前后端通过Restful接口进行通信。通信的数据格式严格按以下json数据实现：

```json
{
    "success": true,
    "message": "",
    "data": {}
}
```

必要的三个字段 success，message，data，其中各字段作用如下：

success： 执行成功或失败

message： 失败时不为空，填充失败原因

data： 所携带的前端需要的数据



## 3.资料

前端教程网页地址： https://www.imooc.com/video/1452

后台教程网页地址：https://www.imooc.com/learn/148