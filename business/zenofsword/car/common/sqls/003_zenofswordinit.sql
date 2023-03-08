ALTER TABLE car_infor_attrib MODIFY COLUMN value_type_car_dict_key varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '这个属性的类型在car_dictionary中对应的key值';

ALTER TABLE car_infor_attrib MODIFY COLUMN type_car_dict_key varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '这个属性类型在car_dictionary中的key值';

ALTER TABLE car_infor_attrib DROP INDEX car_infor_attrib_car_infor_id_IDX;
CREATE UNIQUE INDEX car_infor_attrib_car_infor_id_IDX USING BTREE ON car_infor_attrib (car_infor_id,type_car_dict_key);

