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

 Date: 09/09/2022 16:11:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for teach_relation_class
-- ----------------------------
DROP TABLE IF EXISTS `teach_relation_class`;
CREATE TABLE `teach_relation_class`  (
  `classId` bigint NULL DEFAULT NULL,
  `teacherId` bigint NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teach_relation_class
-- ----------------------------
INSERT INTO `teach_relation_class` VALUES (1, 1);
INSERT INTO `teach_relation_class` VALUES (2, 1);
INSERT INTO `teach_relation_class` VALUES (3, 1);
INSERT INTO `teach_relation_class` VALUES (2, 2);
INSERT INTO `teach_relation_class` VALUES (3, 2);

SET FOREIGN_KEY_CHECKS = 1;
