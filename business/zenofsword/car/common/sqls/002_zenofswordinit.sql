ALTER TABLE car_dictionary ADD `ordering` bigint unsigned NOT NULL COMMENT '顺序';

CREATE UNIQUE INDEX car_company_name_IDX USING BTREE ON car_company (name);

ALTER TABLE car_dictionary CHANGE `values` value varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL;
