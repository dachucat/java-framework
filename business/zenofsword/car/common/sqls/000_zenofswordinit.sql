CREATE TABLE `car_advantage` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `type` tinyint unsigned NOT NULL COMMENT '这个优势的类型，1为是否是优势，2为这个优势存在最大值,3为这个优势存在最小值',
  `value` bigint unsigned NOT NULL COMMENT '当type为1,value为1时，它是一个优势，而value 为0时，它不是一个优势；\r\n当type为2，value为这个优势的最大值；\r\n当type为3，value为这个优势的最小值；',
  `attrib_car_map_key` varchar(100) NOT NULL COMMENT '这个属性名称在car_map中的key值',
  PRIMARY KEY (`id`),
  UNIQUE KEY `car_advantage_type_IDX` (`type`,`value`,`attrib_car_map_key`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `car_brand` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `icon` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `car_company_id` varchar(100) NOT NULL COMMENT '所属公司id',
  PRIMARY KEY (`id`),
  KEY `car_brand_icon_IDX` (`icon`,`name`,`car_company_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `car_brand` VALUES (2,'123','大众','3'),(3,'1234','奥迪','1');

CREATE TABLE `car_company` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `address` varchar(100) DEFAULT NULL COMMENT '集团地址',
  `email` varchar(32) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `icon` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `car_company` VALUES (2,'一汽大众',NULL,NULL,'','1234'),(3,'一汽奥迪',NULL,NULL,NULL,'1234'),(4,'一汽奥迪',NULL,NULL,NULL,'1234');

CREATE TABLE `car_dictionary` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `values` varchar(100) NOT NULL,
  `key` varchar(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `car_map_values_IDX` (`values`,`type`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='车这一个业务的字典';

INSERT INTO `car_dictionary` VALUES (1,'3','1','排量');

CREATE TABLE `car_infor` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `quoted price` bigint unsigned NOT NULL COMMENT '报价,单位：元',
  `guide_price` bigint unsigned NOT NULL COMMENT '指导价,单位：元',
  `car_pattern_id` bigint unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='关于一种类型的车的信息（如江淮 瑞风M3 这就是一种车）';

CREATE TABLE `car_infor_attrib` (
  `car_infor_id` bigint unsigned NOT NULL,
  `type_car_dict_key` varchar(19) NOT NULL COMMENT '这个属性类型在car_map中的key值',
  `value` bigint unsigned DEFAULT NULL COMMENT 'value的值表示属性的值在car_map中对应的key值，或者就是一个值',
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `remark` text,
  `icon` varchar(100) DEFAULT NULL,
  `value_type` tinyint unsigned NOT NULL COMMENT '0表示value 的值为一个 key值，1表示value的值为一个数字',
  `introduction` varchar(200) DEFAULT NULL COMMENT '对于这一项的介绍',
  PRIMARY KEY (`id`),
  UNIQUE KEY `car_attrib_un` (`car_infor_id`,`type_car_dict_key`,`value`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `car_infor_photo` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `car_infor_id` bigint unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `car_pattern` (
  `id` bigint unsigned NOT NULL,
  `car_pattern` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '车型(是奥迪的x3?宝马的q5?)',
  `car_brand_id` bigint unsigned NOT NULL,
  `time_pattern` char(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '年份款式（如2020款）',
  `pattern_car_dict_key` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '款式key（运动？时尚？）',
  KEY `car_pattern_car_brand_id_IDX` (`car_brand_id`,`car_pattern`,`time_pattern`,`pattern_car_dict_key`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='车的款式';

CREATE TABLE `dictionary` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `type` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `key` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `values` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `dictionary_type_IDX` (`type`,`key`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `used_car` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `car_infor_id` bigint unsigned NOT NULL,
  `account_id` bigint unsigned NOT NULL COMMENT '账户id',
  `post_date` date NOT NULL COMMENT '该二手车售卖信息发布时间',
  `building_id` bigint unsigned NOT NULL COMMENT '该二手车地点建筑id（提车地点、试车地点等）',
  `license_date` date NOT NULL COMMENT '首次上牌时间',
  `contacted_name` varchar(50) NOT NULL COMMENT '联系人名字',
  `contacted_phone` varchar(30) NOT NULL COMMENT '联系人电话',
  `status` tinyint unsigned NOT NULL DEFAULT '0' COMMENT '表示是否售卖，0代表未售卖，1代表已售卖',
  `photo_count` tinyint unsigned NOT NULL DEFAULT '0' COMMENT '照片数量',
  `used_car_dict_key` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'dictionary中车辆性质的id',
  `insurance_date` date DEFAULT NULL COMMENT '商业险到期时间',
  `annual_inspection_date` date DEFAULT NULL COMMENT '年检到期时间',
  `maintenance_dict_key` bigint unsigned NOT NULL COMMENT 'dictionary中维修保养种类id',
  `compulsory_insurance_date` date DEFAULT NULL COMMENT '强险到期时间',
  `vin` varchar(30) NOT NULL COMMENT '车辆vin码',
  `description` text COMMENT '对于该车描述',
  `transfer_fee` tinyint unsigned NOT NULL COMMENT '过户费，0为不包含，1为包含',
  `anxuan` tinyint unsigned NOT NULL COMMENT '是否安选，0代表未安选，1代表安选',
  `price` bigint unsigned DEFAULT NULL COMMENT '单位：元',
  `mileage` bigint unsigned NOT NULL COMMENT '里程数（单位：万公里）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='关于二手车';

CREATE TABLE `used_car_attrib` (
  `used_car_id` bigint unsigned NOT NULL,
  `type_car_map_key` varchar(19) NOT NULL COMMENT '这个属性类型在car_map中的key值',
  `value` bigint unsigned DEFAULT NULL COMMENT 'value的值表示属性的值在car_map中对应的key值，或者就是一个值',
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `remark` text,
  `icon` varchar(100) DEFAULT NULL,
  `value_type` tinyint unsigned NOT NULL COMMENT '0表示value 的值为一个 key值，1表示value的值为一个数字',
  `introduction` varchar(200) DEFAULT NULL COMMENT '对于这一项的介绍',
  PRIMARY KEY (`id`),
  UNIQUE KEY `car_attrib_un` (`used_car_id`,`type_car_map_key`,`value`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `used_car_photo` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `used_car_id` bigint unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `car_pattern` (
  `id` bigint unsigned NOT NULL,
  `car_pattern` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '车型(是奥迪的x3?宝马的q5?)',
  `car_brand_id` bigint unsigned NOT NULL,
  `time_pattern` char(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '年份款式（如2020款）',
  `pattern_car_dict_key` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '款式key（运动？时尚？）',
  KEY `car_pattern_car_brand_id_IDX` (`car_brand_id`,`car_pattern`,`time_pattern`,`pattern_car_dict_key`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='车的款式';

