drop index Index_1 on identity_card_warning_log;

drop table if exists identity_card_warning_log;

/*==============================================================*/
/* Table: identity_card_warning_log                             */
/*==============================================================*/
create table identity_card_warning_log
(
   id                   int not null auto_increment,
   identity_card_user_name varchar(200),
   identity_card        timestamp,
   warning_type         tinyint,
   mobile_phone         varchar(100),
   warning_time         timestamp,
   operation_user_id    int,
   operation_user_name  varchar(200),
   primary key (id)
);

alter table identity_card_warning_log comment '身份证预警记录';

/*==============================================================*/
/* Index: Index_1                                               */
/*==============================================================*/
create index Index_1 on identity_card_warning_log
(

);






drop index Index_1 on monitor_identity_card;

drop table if exists monitor_identity_card;

/*==============================================================*/
/* Table: monitor_identity_card                                 */
/*==============================================================*/
create table monitor_identity_card
(
   id                   int not null auto_increment,
   user_name            varchar(200),
   identity_card        varchar(100),
   operation_user_id    int,
   operation_user_name  varchar(200),
   operation_time       timestamp,
   primary key (id)
);

alter table monitor_identity_card comment '身份证布控信息表';

/*==============================================================*/
/* Index: Index_1                                               */
/*==============================================================*/
create index Index_1 on monitor_identity_card
(

);
