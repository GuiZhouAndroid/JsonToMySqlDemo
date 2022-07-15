use dictionary;

create table xiehouyu(
	xhy_id int not null auto_increment primary key comment '歇后语id',
	xhy_riddle varchar(255) not null comment '谜底',
	xhy_answer varchar(255) not null comment '答案'
);
alter table xiehouyu comment '歇后语表';