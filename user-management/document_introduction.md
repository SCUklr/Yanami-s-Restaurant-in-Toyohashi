# RESTful User Management Project 项目结构

## 项目概述

这是一个基于Spring Boot的RESTful用户管理系统，提供用户的CRUD操作接口。

## 目录结构


user-management/

├── src/

│ ├── main/

│ │ ├── java/

│ │ │ └── com/

│ │ │ └── example/

│ │ │ └── usermanagement/

│ │ │ ├── UserManagementApplication.java # 应用程序入口

│ │ │ ├── controller/

│ │ │ │ └── UserController.java # REST API控制器

│ │ │ ├── service/

│ │ │ │ ├── UserService.java # 服务层接口

│ │ │ │ └── impl/

│ │ │ │ └── UserServiceImpl.java # 服务层实现

│ │ │ ├── repository/

│ │ │ │ └── UserRepository.java # 数据访问层

│ │ │ ├── model/

│ │ │ │ └── User.java # 用户实体类

│ │ │ └── dto/

│ │ │ └── UserDTO.java # 数据传输对象

│ │ └── resources/

│ │ └── application.properties # 应用配置文件

│ └── test/

│ └── java/

│ └── com/

│ └── example/

│ └── usermanagement/

│ └── UserManagementApplicationTests.java # 测试类

└── pom.xml # Maven配置文件

## 核心文件说明

### 配置文件

- `pom.xml`: Maven项目配置文件，管理项目依赖和构建配置
- `application.properties`: Spring Boot应用配置文件，包含数据库、服务器等配置

### 核心代码文件

1. **入口类**

   - `UserManagementApplication.java`: 应用程序启动类，包含main方法
2. **控制层(Controller)**

   - `UserController.java`: 处理HTTP请求，提供RESTful API接口
3. **服务层(Service)**

   - `UserService.java`: 定义业务逻辑接口
   - `UserServiceImpl.java`: 实现业务逻辑
4. **数据访问层(Repository)**

   - `UserRepository.java`: 继承JpaRepository，提供数据库操作接口
5. **实体类(Model)**

   - `User.java`: 用户实体类，映射数据库表结构
6. **数据传输对象(DTO)**

   - `UserDTO.java`: 用于前后端数据传输的对象

### 测试文件

- `UserManagementApplicationTests.java`: 应用程序测试类
