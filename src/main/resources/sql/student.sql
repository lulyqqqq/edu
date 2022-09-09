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

 Date: 09/09/2022 16:10:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` bigint NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `classId` bigint NULL DEFAULT NULL,
  `role` bigint NULL DEFAULT 0,
  `passwd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (101, 'zhangsan', 1, 0, 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `student` VALUES (102, 'lisi', 2, 0, 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `student` VALUES (103, 'zhangui', 1, 0, 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `student` VALUES (104, 'wuyi', 1, 0, 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `student` VALUES (105, 'sansi', 2, 0, 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `student` VALUES (106, 'keyan', 3, 0, 'e10adc3949ba59abbe56e057f20f883e');

SET FOREIGN_KEY_CHECKS = 1;
