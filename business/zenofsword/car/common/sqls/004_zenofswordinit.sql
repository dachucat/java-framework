ALTER TABLE car_infor_photo ADD photo varchar(100) NOT NULL;

ALTER TABLE used_car_photo ADD photo varchar(100) NOT NULL;

ALTER TABLE used_car_photo ADD `ordering` tinyint unsigned NOT NULL;

ALTER TABLE car_infor_photo ADD `ordering` tinyint unsigned NOT NULL;

ALTER TABLE car_advantage CHANGE attrib_car_map_key attrib_key varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '这个属性名称在car_map中的key值';

ALTER TABLE car_advantage MODIFY COLUMN value bigint unsigned NOT NULL COMMENT '这个属性的值在car_dictionary中对应的key值，可选项为是优势、不是优势、这个优势存在最小值、这个优势存在最大值';

ALTER TABLE car_advantage CHANGE `type` type_key VARCHAR(100) NOT NULL COMMENT '这个优势类型在car_dictionary中对应的key值。可选项：是、否、这个优势存在最大值、这个优势存在最小值';

ALTER TABLE car_advantage MODIFY COLUMN type_key VARCHAR(100) NOT NULL COMMENT '这个优势类型在car_dictionary中对应的key值。可选项：是、否、这个优势存在最大值、这个优势存在最小值';

ALTER TABLE car_advantage DROP INDEX car_advantage_type_IDX;

CREATE UNIQUE INDEX car_advantage_type_key_IDX USING BTREE ON car_advantage (type_key);

CREATE UNIQUE INDEX car_infor_car_pattern_id_IDX USING BTREE ON car_infor (car_pattern_id);

ALTER TABLE car_pattern CHANGE pattern_car_dict_key pattern_key varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '款式key（运动？时尚？）';

CREATE UNIQUE INDEX car_pattern_car_pattern_IDX USING BTREE ON car_pattern (car_pattern,car_brand_id,time_pattern,pattern_key);

ALTER TABLE used_car CHANGE used_car_dict_key nature_key varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'dictionary中车辆性质的id';

ALTER TABLE used_car CHANGE maintenance_dict_key maintenance_key bigint unsigned NOT NULL COMMENT 'dictionary中维修保养种类id';

ALTER TABLE used_car CHANGE transfer_fee transfer_fee_key VARCHAR(32) NOT NULL COMMENT '过户费在car_dictionary中对应的类型（包含、不包含）';

ALTER TABLE used_car MODIFY COLUMN transfer_fee_key VARCHAR(32) NOT NULL COMMENT '过户费在car_dictionary中对应的类型（包含、不包含）';

ALTER TABLE used_car MODIFY COLUMN anxuan_key VARCHAR(32) NOT NULL COMMENT '安选在car_dictionary中对应的key（是，否）';

ALTER TABLE used_car MODIFY COLUMN maintenance_key varchar(32) NOT NULL COMMENT 'dictionary中维修保养种类key';

ALTER TABLE used_car MODIFY COLUMN price bigint unsigned NOT NULL COMMENT '单位：元';

ALTER TABLE dictionary ADD `ordering` tinyint unsigned NOT NULL;

ALTER TABLE used_car_attrib CHANGE type_car_map_key type_key varchar(19) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '这个属性类型在car_map中的key值';

ALTER TABLE used_car_attrib MODIFY COLUMN type_key varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '这个属性类型在car_map中的key值';






