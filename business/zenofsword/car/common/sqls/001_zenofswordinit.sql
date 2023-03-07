ALTER TABLE car_brand DROP INDEX car_brand_icon_IDX;
CREATE UNIQUE INDEX car_brand_car_company_id_IDX USING BTREE
ON car_brand (car_company_id,name);
