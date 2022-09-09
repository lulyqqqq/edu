/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : test1

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 09/09/2022 16:10:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for login_record
-- ----------------------------
DROP TABLE IF EXISTS `login_record`;
CREATE TABLE `login_record`  (
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `time` datetime NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of login_record
-- ----------------------------
INSERT INTO `login_record` VALUES ('jiance', '2022-09-04 23:05:01');
INSERT INTO `login_record` VALUES ('jiance', '2022-09-04 23:05:16');
INSERT INTO `login_record` VALUES ('jiance', '2022-09-08 12:24:32');
INSERT INTO `login_record` VALUES ('jiance', '2022-09-08 12:26:54');
INSERT INTO `login_record` VALUES ('jiance', '2022-09-08 12:27:18');
INSERT INTO `login_record` VALUES ('zhangsan', '2022-09-08 12:34:08');

SET FOREIGN_KEY_CHECKS = 1;
