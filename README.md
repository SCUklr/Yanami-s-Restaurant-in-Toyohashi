# Yanami's Restaurant in Toyohashi

## 项目简介
这是一个基于Spring Boot开发的餐厅管理系统，专门为位于丰桥市的Yanami餐厅设计。系统提供完整的餐厅管理功能，包括菜单管理、订单处理、餐桌预订等功能。

## 主要功能
- 菜单管理：添加、修改、删除菜品
- 订单管理：创建订单、修改订单状态、查看订单历史
- 餐桌管理：餐桌预订、查看餐桌状态
- 顾客管理：顾客信息管理、会员系统
- 支付管理：订单结算、支付处理

## 技术栈
- 后端：Spring Boot 3.2.3
- 数据库：H2 Database (开发环境)
- API文档：Swagger/OpenAPI
- 项目管理：Maven
- 开发语言：Java 21

## 开发环境设置
1. 确保已安装以下软件：
   - JDK 21
   - Maven 3.8+
   - IDE (推荐使用IntelliJ IDEA或Eclipse)

2. 克隆项目：
```bash
git clone https://github.com/SCUklr/Yanami-s-Restaurant-in-Toyohashi.git
```

3. 进入项目目录：
```bash
cd Yanami-s-Restaurant-in-Toyohashi
```

4. 构建项目：
```bash
mvn clean install
```

5. 运行项目：
```bash
mvn spring-boot:run
```

## API文档
启动项目后，可以通过以下地址访问API文档：
- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI文档: http://localhost:8080/v3/api-docs

## 项目结构
```
yanami-restaurant/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/yanamirestaurant/
│   │   │       ├── controller/    # API控制器
│   │   │       ├── service/       # 业务逻辑
│   │   │       ├── repository/    # 数据访问
│   │   │       ├── model/         # 数据模型
│   │   │       └── dto/           # 数据传输对象
│   │   └── resources/
│   │       └── application.properties  # 配置文件
│   └── test/                          # 测试代码
└── pom.xml                            # Maven配置
```

## 贡献指南
1. Fork 项目
2. 创建功能分支 (`git checkout -b feature/AmazingFeature`)
3. 提交更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 开启 Pull Request

## 联系方式
项目维护者：[您的名字]
邮箱：[您的邮箱]

## 许可证
本项目采用 MIT 许可证 