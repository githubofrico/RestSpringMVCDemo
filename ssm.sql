/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2017-07-05 16:37:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for log_inf
-- ----------------------------
DROP TABLE IF EXISTS `log_inf`;
CREATE TABLE `log_inf` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime DEFAULT NULL,
  `msg` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of log_inf
-- ----------------------------
INSERT INTO `log_inf` VALUES ('1', '2017-06-22 13:54:15', '用户 rico 注册成功...');
INSERT INTO `log_inf` VALUES ('2', '2017-06-22 13:54:42', 'rico登录成功...');
INSERT INTO `log_inf` VALUES ('3', '2017-06-22 15:32:14', 'rico登录成功...');
INSERT INTO `log_inf` VALUES ('4', '2017-06-22 15:33:55', '用户 shudaizi 注册成功...');
INSERT INTO `log_inf` VALUES ('5', '2017-06-22 15:34:04', 'shudaizi登录成功...');
INSERT INTO `log_inf` VALUES ('6', '2017-06-27 08:36:31', 'rico登录成功...');
INSERT INTO `log_inf` VALUES ('7', '2017-06-27 08:37:09', '用户 林建睿 注册成功...');
INSERT INTO `log_inf` VALUES ('8', '2017-06-27 08:37:19', '林建睿登录成功...');
INSERT INTO `log_inf` VALUES ('9', '2017-06-27 15:49:42', '存在ID为 3 的用户，查询成功...');
INSERT INTO `log_inf` VALUES ('10', '2017-06-27 15:51:08', '存在ID为 3 的用户，查询成功...');
INSERT INTO `log_inf` VALUES ('11', '2017-06-27 15:52:18', '存在ID为 3 的用户，查询成功...');
INSERT INTO `log_inf` VALUES ('12', '2017-06-30 08:23:43', '存在ID为 3 的用户，查询成功...');

-- ----------------------------
-- Table structure for user_inf
-- ----------------------------
DROP TABLE IF EXISTS `user_inf`;
CREATE TABLE `user_inf` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(30) DEFAULT NULL,
  `passwd` varchar(30) DEFAULT NULL,
  `gentle` varchar(10) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_inf
-- ----------------------------
INSERT INTO `user_inf` VALUES ('1', 'rico', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('2', 'shudaizi', '123', 'nan', 'ahah', 'beijing');
INSERT INTO `user_inf` VALUES ('3', '林建睿', '123', '男', 'rico_betterme@163.com', '大同');
INSERT INTO `user_inf` VALUES ('36', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('37', 'shudaizi', '123', '男', 'shudaizi@tju.edu.cn', '沈阳');
INSERT INTO `user_inf` VALUES ('38', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('39', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('40', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('41', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('42', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('43', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('44', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('45', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('46', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('47', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('48', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('49', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('50', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('51', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('52', 'ricoo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('53', 'oo', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('54', 'o', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('55', 'shudaizi', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('56', 'shudaizi', '123', '男', 'rico@tju.edu.cn', '天津');
INSERT INTO `user_inf` VALUES ('57', 'shudaizi', '123', '男', 'rico@tju.edu.cn', '天津');
