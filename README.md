# Yanami's Restaurant in Toyohashi

## 项目简介
这是一个基于Spring Boot + Vue3开发的餐厅管理系统，专门为位于丰桥市的Yanami餐厅设计。系统提供完整的餐厅管理功能，包括菜单管理、订单处理、餐桌预订等功能。

## 技术栈
### 后端
- Spring Boot 3.2.3
- Spring Data JPA
- H2 Database (开发环境)
- Maven
- Java 21

### 前端
- Vue 3
- TypeScript
- Vue Router
- Pinia
- Element Plus
- Axios
- Sass

## 项目结构
```
Yanami-s-Restaurant-in-Toyohashi/
├── backend/              # Spring Boot后端
│   ├── src/              # 后端源代码
│   ├── pom.xml           # Maven配置
│   └── ...              # 其他后端文件
├── frontend/            # Vue3前端
│   ├── src/             # 前端源代码
│   ├── public/          # 静态资源
│   ├── package.json     # npm配置
│   └── ...             # 其他前端文件
└── README.md           # 项目说明文档
```

## 开发环境设置
### 后端
1. 确保已安装：
   - JDK 21
   - Maven 3.8+

2. 进入后端目录：
```bash
cd backend
```

3. 构建项目：
```bash
mvn clean install
```

4. 运行项目：
```bash
mvn spring-boot:run
```

### 前端
1. 确保已安装：
   - Node.js 20+
   - npm 10+

2. 进入前端目录：
```bash
cd frontend
```

3. 安装依赖：
```bash
npm install
```

4. 运行开发服务器：
```bash
npm run dev
```

## API文档
启动后端服务后，可以通过以下地址访问API文档：
- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI文档: http://localhost:8080/v3/api-docs

## 主要功能
- 菜单管理：添加、修改、删除菜品
- 订单管理：创建订单、修改订单状态、查看订单历史
- 餐桌管理：餐桌预订、查看餐桌状态
- 顾客管理：顾客信息管理、会员系统
- 支付管理：订单结算、支付处理

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