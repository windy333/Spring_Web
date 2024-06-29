/*
 Navicat Premium Data Transfer

 Source Server         : SQL of Windy
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : infosc

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 02/12/2023 23:32:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_article
-- ----------------------------
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article`  (
  `articID` int(4) NOT NULL COMMENT '文章编号',
  `articType` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文章类型',
  `articTitle` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文章标题',
  `articContent` varchar(10000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文章内容',
  `articAuthor` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文章作者',
  `articTime` datetime NULL DEFAULT NULL COMMENT '发表时间',
  PRIMARY KEY (`articID`) USING BTREE,
  INDEX `article_ibfk_1`(`articAuthor`) USING BTREE,
  CONSTRAINT `article_ibfk_1` FOREIGN KEY (`articAuthor`) REFERENCES `t_user` (`userName`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_article
-- ----------------------------
INSERT INTO `t_article` VALUES (1, '艺术设计', '人体描边', '人体描边是一种艺术美学', 'LiLi', '2023-10-11 20:23:25');
INSERT INTO `t_article` VALUES (2, '程序设计', 'c++', NULL, 'LiLi', NULL);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `userName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工名称',
  `userPwd` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工密码',
  `eMail` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工邮箱',
  `telephone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `loginTimes` int(4) NOT NULL COMMENT '登录次数',
  PRIMARY KEY (`userName`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('admin', '666', 'admin@qq.com', '311001', 0);
INSERT INTO `t_user` VALUES ('lan', '123', 'lan@qq.com', '31113', 3);
INSERT INTO `t_user` VALUES ('LiLi', '123', 'LiLi@qq.com', '31112', 0);

SET FOREIGN_KEY_CHECKS = 1;
