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