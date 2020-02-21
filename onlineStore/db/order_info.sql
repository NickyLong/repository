create table ORDER_INFO(
    order_id        varchar(20)     primary key,
    order_time      date,
    total_amount    varchar(30),
    address         varchar(100),
    order_phone     varchar(20),
    order_status    varchar(2),
    user_id         varchar(20),
    constraint fk_001 foreign key (user_id)  references USER_INFO (user_id)
);