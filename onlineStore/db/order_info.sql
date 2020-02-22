create table ORDER_INFO(
    order_id        varchar(48)     primary key,
    order_time      date,
    total_amount    varchar(48),
    address         varchar(100),
    order_phone     varchar(20),
    order_status    varchar(2),
    user_id         varchar(48),
    constraint fk_001 foreign key (user_id)  references USER_INFO (user_id)
);