/*
Navicat MySQL Data Transfer

Source Server         : fire
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : clouddb01

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2019-11-02 13:42:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(50) DEFAULT NULL,
  `dbSource` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', 'Develop', 'clouddb01');
INSERT INTO `dept` VALUES ('2', 'Human', 'clouddb01');
INSERT INTO `dept` VALUES ('3', 'Market', 'clouddb01');
INSERT INTO `dept` VALUES ('4', 'Opreation', 'clouddb01');
INSERT INTO `dept` VALUES ('5', 'Finacial', 'clouddb01');
