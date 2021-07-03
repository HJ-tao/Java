/*
Navicat MySQL Data Transfer

Source Server         : mycon
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2017-07-06 11:00:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cgk
-- ----------------------------
DROP TABLE IF EXISTS `cgk`;
CREATE TABLE `cgk` (
  `cgdh` int(11) NOT NULL AUTO_INCREMENT COMMENT '采购单号',
  `dfmc` varchar(64) NOT NULL COMMENT '对方单位名称',
  `cgyj` float(10,2) NOT NULL COMMENT '采购原价',
  `cgzk` float(8,2) NOT NULL DEFAULT '0.00' COMMENT '采购折扣',
  `cgje` float(10,2) NOT NULL COMMENT '采购金额',
  `cgyg` varchar(8) NOT NULL COMMENT '采购员工编号',
  `shbz` tinyint(4) DEFAULT '0' COMMENT '审核标志(0未审,1已审)',
  `cgsj` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '采购时间',
  PRIMARY KEY (`cgdh`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of cgk
-- ----------------------------
INSERT INTO `cgk` VALUES ('1', '书馨书店', '6350.00', '320.00', '6032.00', '000003', '0', '2017-05-01 22:23:49');
INSERT INTO `cgk` VALUES ('2', '江海书行', '2700.00', '135.00', '2565.00', '000003', '0', '2017-05-04 13:40:43');
INSERT INTO `cgk` VALUES ('3', '书馨书店', '8337.00', '399.00', '7938.00', '000003', '0', '2017-05-04 13:45:48');
INSERT INTO `cgk` VALUES ('4', '远帆书店', '5200.00', '260.00', '4940.00', '000003', '0', '2017-05-04 13:46:39');
INSERT INTO `cgk` VALUES ('5', '新华书店', '5200.00', '260.00', '4940.00', '000003', '0', '2017-07-06 08:46:39');
INSERT INTO `cgk` VALUES ('6', '起航书店', '5200.00', '260.00', '4940.00', '000003', '0', '2017-07-06 08:46:39');
INSERT INTO `cgk` VALUES ('7', '成功书店', '5200.00', '260.00', '4940.00', '000003', '0', '2017-07-06 08:46:39');
