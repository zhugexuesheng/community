create table cheng_shi
(
    id                   int auto_increment comment '城市表主键id'
        primary key,
    cheng_shi_ming_cheng varchar(12) not null comment '城市名称',
    sheng_fen_id         int         not null comment '省份表id外键'
)
    comment '城市表';

create table fang_wu_hu_zhu
(
    id                  int auto_increment comment '房屋和户主表主键id'
        primary key,
    xiao_qu_id          int         not null comment '小区表id外键',
    re_li_gong_si_id    int         not null comment '热力公司表id外键',
    lou_dong            varchar(2)  not null comment '楼栋号',
    dan_yuan            varchar(2)  not null comment '单元号',
    fang_wu_mian_ji     varchar(3)  not null comment '房屋面积',
    fang_hao            varchar(4)  not null comment '房号',
    re_li_bian_hao      varchar(6)  not null comment '热力编号',
    hu_zhu_xing_ming    varchar(12) not null comment '户主姓名',
    lian_xi_fang_shi    varchar(11) not null comment '联系方式',
    jiao_fei_zhuang_tai varchar(1)  not null comment '缴费状态(0已欠费 1待缴费  2已缴费)',
    gong_re_zhuang_tai  varchar(1)  not null comment '供热状态(0关停 1正常)'
)
    comment '房屋和户主表';

create table jue_se
(
    id                int auto_increment comment '角色表主键'
        primary key,
    jue_se_ming_cheng varchar(12) not null comment '角色名称',
    constraint jue_se_jue_se_ming_cheng_uindex
        unique (jue_se_ming_cheng)
)
    comment '角色表';

create table re_li_gong_si
(
    id                       int auto_increment comment '热力公司表主键id'
        primary key,
    re_li_gong_si_ming_cheng varchar(12) not null comment '热力公司名称',
    cheng_shi_id             int         not null comment '城市外键id'
)
    comment '热力公司表';

create table sheng_fen
(
    id                   int auto_increment comment '省份主键id'
        primary key,
    sheng_fen_ming_cheng varchar(12) not null comment '省份名称'
)
    comment '省份';

create table shou_fei_zhang_dan
(
    id                        int auto_increment comment '收费账单主键id'
        primary key,
    fang_wu_hu_zhu_id         int           not null comment '房屋和户主表id外键',
    gong_re_ji_du             varchar(2)    not null comment '供热季度',
    gong_re_shi_jian          varchar(2)    not null comment '供热时间',
    ri_dan_jia                decimal(7, 2) not null comment '日单价',
    ying_jiao_fei_yong        decimal(7, 2) not null comment '应缴缴费',
    shou_fei_kai_shi_shi_jian datetime      not null comment '收费开始时间',
    shou_fei_jie_shu_shi_jian datetime      not null comment '收费结束时间'
)
    comment '收费账单';

create table shou_kuan_zhang_hu
(
    id                 int auto_increment comment '收款账户主键id'
        primary key,
    cheng_shi_id       int         not null comment '城市表id外键',
    re_li_gong_si_id   int         not null comment '热力公司表id外键',
    yin_hang_zhang_hao varchar(19) not null comment '银行账号',
    kai_hu_ren         varchar(12) not null comment '开户人',
    kai_hu_hang        varchar(30) not null comment '开户行'
)
    comment '收款账户';

create table test
(
    id       int auto_increment
        primary key,
    username varchar(12) not null,
    password varchar(12) not null,
    constraint Test_username_uindex
        unique (username)
);

create table xiao_qu
(
    id                 int auto_increment comment '小区表主键id'
        primary key,
    xiao_qu_ming_cheng varchar(30) not null comment '小区名称',
    cheng_shi_id       int         not null comment '城市表id外键'
)
    comment '小区表';

create table yong_hu
(
    id                   int auto_increment comment '用户表主键id'
        primary key,
    yong_hu_ming_cheng   varchar(12) not null comment '用户名称',
    mi_ma                varchar(12) not null comment '密码',
    xing_ming            varchar(12) not null comment '姓名',
    lian_xi_fang_shi     varchar(11) null comment '联系方式',
    jue_se_id            int         not null comment '角色表外键id',
    chuang_jian_ren      varchar(12) not null,
    chuang_jian_shi_jian datetime    not null comment '创建时间',
    zhuang_tai           varchar(1)  not null comment '状态(0代表禁用 1代表启用)',
    constraint yong_hu_yong_hu_ming_cheng_uindex
        unique (yong_hu_ming_cheng)
)
    comment '用户表';


