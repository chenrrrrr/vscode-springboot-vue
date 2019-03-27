## vscode springboot 开发模板

解决了哪些事：

- 统一了`IDE`，毕竟`vscode`这么强大，论速度、美观、体积，都是完胜`idea`、`eclipse`系的，无需担心`vscode`的快捷键、快速生成`getter、setter、class`，`lombok`已经解决了这些问题

- 提供了两套方案：

  - 传统服务端渲染`ssr`，集成了`Freemarker`，`MySQL`，`MyBatis`，`SpringMVC`基本配置

  - 前后端分离，后端提供`api`，前端`vue(axios)`跨域请求

> 其实搞这些就是为了自己爽的

## 起步

#### 配置环境 - Java

配置`vscode`下的`springboot`开发环境：

- 第一步，安装 vscode 插件依赖：

  - Java Extension Pack
  - Maven for Java
  - Spring Boot Extension Pack
  - Lombok Annotations Support for VS Code(lombok 环境，否则你后台打死接不到前台传参的)

> 建议下载`maven`配置阿里仓库，不然下载依赖包会很慢

配置`setting.json`，增加如下配置

```json
  "files.exclude": {
    "**/.classpath": true,
    "**/.project": true,
    "**/.settings": true,
    "**/.factorypath": true
  },
  "editor.suggestSelection": "first",
  // 自动 override
  "vsintellicode.modify.editor.suggestSelection": "automaticallyOverrodeDefaultValue",
  // jdk 安裝路径
  "java.home": "C:/Program Files/Java/jdk1.8.0_201",
  // maven - mvn 路径
  "maven.executable.path": "D:/apache-maven-3.6.0/bin/mvn",
  // maven 配置 推荐阿里仓库
  "java.configuration.maven.userSettings": "D:/apache-maven-3.6.0/conf/settings.xml",
  "maven.terminal.customEnv": [
    {
      "environmentVariable": "JAVA_HOME",
      "value": "C:/Program Files/Java/jdk1.8.0_201"
    }
  ],
```

- 第二步，修改 `MySQL` 数据库配置

`application.properties`

```xml
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/你的database名
spring.datasource.username=root
spring.datasource.password=你的database密码
```

- 第三步，进入调试`ctrl+shift+f5`，点击`没有配置>添加配置`，等待 vscode 自己下载好相关依赖 jar

- 第四步，按下`F5`，启动`springboot`

#### Vue

使用`vue-cli 3.5.X`构建，默认集成了`less`，`axios`，`vue.config.js`做了跨域配置，建议使用`vue ui`进行扩展，很方便，`vue-cli3`对插件做了规范，整体的结构更加的简洁明了

cd 到`/mooc`下

```bash
# 安装依赖
yarn
# 启动项目
yarn serve
```

## Q&A

- 如果使用`SSR`渲染，控制层注解使用`@Controller`

- 如果使用`vue`前后端分离，控制层注解使用`@RestController`

- 如`Java`接口接受不到参数值，请百度查询`lombok`实体类注解是否存在错误

## Demo 数据库建表语句

```sql
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
```

## 继续完善...

如果对你有用，请给我个 star，3q Sir!
