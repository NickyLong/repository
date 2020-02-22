create table ORDER_DETAIL_INFO(
    order_detail_id     varchar(48)     primary key,
    order_id            varchar(48),
    product_id          varchar(48),
    num                 varchar(10),
    subtotal            varchar(48),
    constraint fk_002 foreign key (order_id) references ORDER_INFO (order_id)
);