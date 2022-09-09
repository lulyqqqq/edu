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

 Date: 09/09/2022 16:10:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for estimate_template
-- ----------------------------
DROP TABLE IF EXISTS `estimate_template`;
CREATE TABLE `estimate_template`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `score` int NULL DEFAULT NULL,
  `content` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `date` datetime NULL DEFAULT CURRENT_TIMESTAMP,
  `studentId` bigint NULL DEFAULT NULL,
  `teacherName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 113 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of estimate_template
-- ----------------------------
INSERT INTO `estimate_template` VALUES (107, 'zhangsan', 5, 'good!', '2022-09-08 20:20:29', 101, 'jiance');
INSERT INTO `estimate_template` VALUES (108, 'zhangsan', 5, 'good!', '2022-09-08 20:21:12', 101, 'jiance');
INSERT INTO `estimate_template` VALUES (109, 'lisi', 9, 'nice!', '2022-09-08 20:21:12', 102, 'jiance');
INSERT INTO `estimate_template` VALUES (110, 'zhangsan', 5, 'good!', '2022-09-08 20:41:50', 101, 'jiance');
INSERT INTO `estimate_template` VALUES (111, 'zhangsan', 5, 'good!', '2022-09-08 20:42:31', 101, 'jiance');
INSERT INTO `estimate_template` VALUES (112, 'lisi', 9, 'nice!', '2022-09-08 20:42:31', 102, 'jiance');
INSERT INTO `estimate_template` VALUES (113, 'zhangsan', 10, 'nice!', '2022-09-08 21:05:52', 101, 'jiance1');

SET FOREIGN_KEY_CHECKS = 1;
