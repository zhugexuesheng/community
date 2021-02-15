1. 功能菜单
   (1).首页
   (2).系统账号角色
       <1>.角色管理
       <2>.账号管理
   (3).基础数据管理
       <1>.房屋和户主信息
       <2>.app注册用户
       <3>.热力公司管理
       <4>.小区数据管理
       <5>.省份管理
       <6>.城市管理
   (4).财务管理
       <1>.收款账户
       <2>.收费计划(不实现)
       <3>.收费账单
       <4>.缴费记录(扩展)

2. 数据库数据字典
   1. 角色表(jue_se)
      id                     int           主键
      jue_se_ming_cheng      varchar(12)   角色名称

   2. 用户表(yong_hu)
      id                     int           主键
      yong_hu_ming_cheng     varchar(12)   用户名称(登录账号)
      mi_ma                  varchar(12)   用户密码(登录密码)
      xing_ming              varchar(12)   用户姓名
      lian_xi_fang_shi       varchar(11)   联系方式
      jue_se_id              int           角色外键id
      chuang_jian_ren        varchar(12)   创建人
      chuang_jian_shi_jian   datetime      创建时间
      zhuang_tai             varchar(1)    状态(0代表禁用 1代表启用)

   3. 热力公司表(re_li_gong_si)
      id                       int           主键
      re_li_gong_si_ming_cheng varchar(12)   热力公司名称
      cheng_shi_id             int           城市id外键

   4. 省份表(sheng_fen)
      id                       int           主键
      sheng_fen_ming_cheng     varchar(12)   省份名称

   5. 城市表(cheng_shi)
      id                       int           主键
      cheng_shi_ming_cheng     varchar(12)   城市名称
      sheng_fen_id             int           省份id外键

   6. 小区表(xiao_qu)
      id                       int           主键
      xiao_qu_ming_cheng       varchar(12)   小区名称
      cheng_shi_id             int           城市id外键

   7. 房屋和户主表(fang_wu_hu_zhu)
      id                       int           主键
      xiao_qu_id               int           小区id外键
      re_li_gong_si_id         int           热力公司id外键
      lou_dong                 varchar(2)    楼栋号
      dan_yuan                 varchar(2)    单元号
      fang_wu_mian_ji          varchar(3)    面积
      fang_hao                 varchar(4)    房号
      re_li_bian_hao           varchar(6)    热力编号
      hu_zhu_xing_ming         varchar(12)   户主姓名
      lian_xi_fang_shi         varchar(11)   联系方式
      jiao_fei_zhuang_tai      varchar(1)    缴费状态(0已欠费 1待缴费  2已缴费)
      gong_re_zhuang_tai       varchar(1)    供热状态(0关停 1正常)

   8. 收款账户(shou_kuan_zhang_hu)
      id                       int           主键
      cheng_shi_id             int           城市id外键
      re_li_gong_si_id         int           热力公司id外键
      yin_hang_zhang_hao       varchar(19)   银行账号
      kai_hu_ren               varchar(12)   开户人
      kai_hu_hang              varchar(30)   开户行

   9. 收费账单(shou_fei_zhang_dan)
      id                       int           主键
      fang_wu_hu_zhu_id        int           房屋和户主表的id外键
      gong_re_ji_du            varchar(2)    供热季度
      gong_re_shi_jian         varchar(2)    供热时间
      ri_dan_jia               decimal(7,2)  日单价
      ying_jiao_fei_yong       decimal(7,2)  应缴缴费
      shou_fei_kai_shi_shi_jian  datetime    收费开始时间
      shou_fei_jie_shu_shi_jian  datetime    收费结束时间



