# RESTful User Management API 测试指南

## API接口测试

### 基础URL

- 本地开发环境：`http://localhost:8080`

### API端点列表

1. **创建用户**

   - 方法: POST
   - URL: `/api/users`
   - Content-Type: `application/json`
   - 请求体示例:
     ```json
     {
       "username": "testuser",
       "password": "password123",
       "email": "test@example.com"
     }
     ```
2. **获取所有用户**

   - 方法: GET
   - URL: `/api/users`
3. **获取单个用户**

   - 方法: GET
   - URL: `/api/users/{id}`
   - 示例: `/api/users/1`
4. **更新用户**

   - 方法: PUT
   - URL: `/api/users/{id}`
   - Content-Type: `application/json`
   - 请求体示例:
     ```json
     {
       "username": "updateduser",
       "email": "updated@example.com"
     }
     ```
5. **删除用户**

   - 方法: DELETE
   - URL: `/api/users/{id}`
   - 示例: `/api/users/1`

### 使用Postman测试

1. 打开Postman
2. 创建新的请求
3. 选择对应的HTTP方法
4. 输入请求URL
5. 如需发送数据，在Body标签页选择raw和JSON格式
6. 输入JSON数据
7. 点击Send发送请求

## H2数据库控制台访问

### 访问方式

1. 打开浏览器
2. 访问URL: `http://localhost:8080/h2-console`

### 登录信息

- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: `password`

### 使用说明

1. 输入以上登录信息
2. 点击"Connect"按钮
3. 连接成功后可以:
   - 查看数据表结构
   - 执行SQL查询
   - 查看和修改数据
