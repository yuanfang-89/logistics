/*
Navicat MySQL Data Transfer

Source Server         : yuanfang
Source Server Version : 50635
Source Host           : localhost:3306
Source Database       : logisticssystem

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2019-12-20 22:01:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `province` varchar(10) NOT NULL,
  `city` varchar(10) NOT NULL,
  `district` varchar(10) NOT NULL,
  `road` varchar(10) NOT NULL,
  `details` varchar(100) NOT NULL,
  PRIMARY KEY (`details`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES ('山东省', '潍坊市', '潍城区', '玉清西街', '东小河村');
INSERT INTO `address` VALUES ('湖南省', '张家界市', '永定区', '子午路', '吉首大学');
INSERT INTO `address` VALUES ('广东省', '佛山市', '南海区', '兆祥路', '桂江第一中学');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `customer_name` varchar(20) NOT NULL,
  `customer_phone` varchar(11) NOT NULL,
  `customer_address` varchar(140) NOT NULL,
  PRIMARY KEY (`customer_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', '1', '元芳', '15874424556', '吉首大学');

-- ----------------------------
-- Table structure for deletedorder
-- ----------------------------
DROP TABLE IF EXISTS `deletedorder`;
CREATE TABLE `deletedorder` (
  `id` varchar(30) NOT NULL,
  `status` int(11) NOT NULL,
  `sendman` varchar(20) NOT NULL,
  `receivename` varchar(20) NOT NULL,
  `receivephone` varchar(11) NOT NULL,
  `receiveaddress` varchar(140) NOT NULL,
  `estimate` text,
  `rid` int(11) DEFAULT NULL,
  `station` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of deletedorder
-- ----------------------------

-- ----------------------------
-- Table structure for express
-- ----------------------------
DROP TABLE IF EXISTS `express`;
CREATE TABLE `express` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `status` int(11) NOT NULL,
  `sendman` varchar(20) NOT NULL,
  `receivename` varchar(20) NOT NULL,
  `receivephone` varchar(11) NOT NULL,
  `receiveaddress` varchar(140) NOT NULL,
  `estimate` text,
  `rid` int(11) DEFAULT NULL,
  `station` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of express
-- ----------------------------
INSERT INTO `express` VALUES ('38', '1', '元芳', '小小', '18624435429', '桂江第一中学', '很好', '5', '3');
INSERT INTO `express` VALUES ('39', '0', '元芳', '阿瑶', '17748793756', '东小河村', null, '3', '2');

-- ----------------------------
-- Table structure for logisticscompany
-- ----------------------------
DROP TABLE IF EXISTS `logisticscompany`;
CREATE TABLE `logisticscompany` (
  `company_name` varchar(30) NOT NULL,
  PRIMARY KEY (`company_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of logisticscompany
-- ----------------------------
INSERT INTO `logisticscompany` VALUES ('极速物流');

-- ----------------------------
-- Table structure for route
-- ----------------------------
DROP TABLE IF EXISTS `route`;
CREATE TABLE `route` (
  `rtid` int(11) NOT NULL,
  `first_station` varchar(10) NOT NULL,
  `second_station` varchar(10) NOT NULL,
  `third_station` varchar(10) NOT NULL,
  `fourth_station` varchar(10) NOT NULL,
  `end_station` varchar(10) NOT NULL,
  PRIMARY KEY (`first_station`,`end_station`,`rtid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of route
-- ----------------------------
INSERT INTO `route` VALUES ('4', '北京市', '杭州市', '长沙市', '常德市', '张家界市');
INSERT INTO `route` VALUES ('5', '张家界市', '常德市', '长沙市', '广州市', '佛山市');
INSERT INTO `route` VALUES ('3', '张家界市', '常德市', '长沙市', '青岛市', '潍坊市');
INSERT INTO `route` VALUES ('2', '汕头市', '揭阳市', '长沙市', '常德市', '张家界市');
INSERT INTO `route` VALUES ('1', '苏州市', '无锡市', '长沙市', '常德市', '张家界市');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `role` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '0');
INSERT INTO `user` VALUES ('2', '2', '1');
INSERT INTO `user` VALUES ('3', '3', '0');
