package com.example.news.bean;

import java.util.List;

public class InfoBean {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"e2f4c884ac1d8a52a0f79f6c40292618","title":"美疾控中心举出实例证明，戴口罩真有效！呼吁民众出行戴上口罩","date":"2020-07-17 11:17","category":"头条","author_name":"北京晚报","url":"https://mini.eastday.com/mobile/200717111744963.html","thumbnail_pic_s":"https://04imgmini.eastday.com/mobile/20200717/20200717111744_5a5a30d9684141d2ccda50061d98f358_1_mwpm_03200403.jpg"},{"uniquekey":"b8e87b607a539d9981c8dec15f981574","title":"天神下凡！巴萨耻辱之夜唯有他可昂首离开，逆天表现无愧世界最佳","date":"2020-07-17 11:13","category":"头条","author_name":"游戏打卡论","url":"https://mini.eastday.com/mobile/200717111310222.html","thumbnail_pic_s":"https://00imgmini.eastday.com/mobile/20200717/20200717111310_4f44625acb6ed24272d26b62a2cc8493_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20200717/20200717111310_4f44625acb6ed24272d26b62a2cc8493_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20200717/20200717111310_4f44625acb6ed24272d26b62a2cc8493_4_mwpm_03200403.jpg"},{"uniquekey":"a59def512bd84574101a234cc3dba784","title":"CBA积分榜：季后赛晋级再增三队，仅剩两席位前12还有悬念吗？","date":"2020-07-17 11:07","category":"头条","author_name":"CBA篮球前线TB","url":"https://mini.eastday.com/mobile/200717110706168.html","thumbnail_pic_s":"https://05imgmini.eastday.com/mobile/20200717/20200717110706_398f24ef4c389f7d6ce2c128424e5814_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20200717/20200717110706_398f24ef4c389f7d6ce2c128424e5814_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20200717/20200717110706_398f24ef4c389f7d6ce2c128424e5814_2_mwpm_03200403.jpg"},{"uniquekey":"73267c63c95aec0200325d53f87b283f","title":"昨天 中方为日本说了句公道话","date":"2020-07-17 11:00","category":"头条","author_name":"环球时报","url":"https://mini.eastday.com/mobile/200717110001016.html","thumbnail_pic_s":"https://05imgmini.eastday.com/mobile/20200717/20200717110001_b1e420aefa0a77925502dfc8eeb5f0a5_1_mwpm_03200403.jpg"},{"uniquekey":"7515b92ce12971b12e14be75fcc6e493","title":"《浪姐》出道名单已内定？有靠山的她，果真不太一样","date":"2020-07-17 10:57","category":"头条","author_name":"快资讯","url":"https://mini.eastday.com/mobile/200717105742307.html","thumbnail_pic_s":"https://07imgmini.eastday.com/mobile/20200717/20200717105742_2d413c6c5c3c704ba4dd77c33208c6b8_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20200717/20200717105742_2d413c6c5c3c704ba4dd77c33208c6b8_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20200717/20200717105742_2d413c6c5c3c704ba4dd77c33208c6b8_3_mwpm_03200403.jpg"},{"uniquekey":"35c940363a774971276288aa6f224f3f","title":"李世民去世4年后，三位驸马被杀街市之中，唐高宗的做法很有深意","date":"2020-07-17 10:53","category":"头条","author_name":"博史通今","url":"https://mini.eastday.com/mobile/200717105335610.html","thumbnail_pic_s":"https://04imgmini.eastday.com/mobile/20200717/20200717105335_a6b7a604085bc2af89c8032ab9797de5_9_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20200717/20200717105335_a6b7a604085bc2af89c8032ab9797de5_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20200717/20200717105335_a6b7a604085bc2af89c8032ab9797de5_4_mwpm_03200403.jpg"},{"uniquekey":"839cee38f3c78e689b586a9134277485","title":"42岁黄奕晒写真气场十足，状态重回18岁，自称是\"幸存者\"","date":"2020-07-17 10:53","category":"头条","author_name":"时尚焦点社","url":"https://mini.eastday.com/mobile/200717105326560.html","thumbnail_pic_s":"https://00imgmini.eastday.com/mobile/20200717/20200717105326_803f5277955c2bc2f88d233e0f944e75_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20200717/20200717105326_803f5277955c2bc2f88d233e0f944e75_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20200717/20200717105326_803f5277955c2bc2f88d233e0f944e75_3_mwpm_03200403.jpg"},{"uniquekey":"aab60ffe1eecebe4372075984ff48833","title":"荣耀一连发布5款新机，价格从1099元到5199元，却没有一款是手机","date":"2020-07-17 10:52","category":"头条","author_name":"闲搞机","url":"https://mini.eastday.com/mobile/200717105244427.html","thumbnail_pic_s":"https://05imgmini.eastday.com/mobile/20200717/20200717105244_53454936513cf60d7aef5dfbf7b7958c_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20200717/20200717105244_53454936513cf60d7aef5dfbf7b7958c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20200717/20200717105244_53454936513cf60d7aef5dfbf7b7958c_5_mwpm_03200403.jpg"},{"uniquekey":"fa19c043320d5cc4900615ae2161da75","title":"94斤杨幂演绎啥叫\u201c肉长对了地方\u201d，这样的魔鬼身材谁不爱？","date":"2020-07-17 10:50","category":"头条","author_name":"小香风看娱乐","url":"https://mini.eastday.com/mobile/200717105038070.html","thumbnail_pic_s":"https://01imgmini.eastday.com/mobile/20200717/20200717105038_984532910ff04e5f6c7473192ce08a0c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20200717/20200717105038_984532910ff04e5f6c7473192ce08a0c_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20200717/20200717105038_984532910ff04e5f6c7473192ce08a0c_3_mwpm_03200403.jpg"},{"uniquekey":"d7b9d4a313038ecd2b82bf3ac3f7b993","title":"17斤重！富阳村民捡到一条娃娃鱼，它到底从哪里来的？","date":"2020-07-17 10:50","category":"头条","author_name":"青年时报","url":"https://mini.eastday.com/mobile/200717105029172.html","thumbnail_pic_s":"https://08imgmini.eastday.com/mobile/20200717/20200717105029_9fde58e3d208cd403296e6bc5a8632cc_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20200717/20200717105029_9fde58e3d208cd403296e6bc5a8632cc_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20200717/20200717105029_9fde58e3d208cd403296e6bc5a8632cc_2_mwpm_03200403.jpg"},{"uniquekey":"71d84f367ee89df2bf02e8b113108f8d","title":"一夜之间消失无踪的埃及古城，千年后，竟然在海底被科学家发现","date":"2020-07-17 10:46","category":"头条","author_name":"邓海春","url":"https://mini.eastday.com/mobile/200717104605299.html","thumbnail_pic_s":"https://04imgmini.eastday.com/mobile/20200717/20200717104605_db65c859a48342a0f47fcf88f2bf16af_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20200717/20200717104605_db65c859a48342a0f47fcf88f2bf16af_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20200717/20200717104605_db65c859a48342a0f47fcf88f2bf16af_7_mwpm_03200403.jpg"},{"uniquekey":"169406eb999c933b0d9b61b4f98ace68","title":"夏天不要错过这菜，炒一炒就上桌，鲜香脆嫩很下饭，好吃停不下筷","date":"2020-07-17 10:40","category":"头条","author_name":"我叫一尾鱼","url":"https://mini.eastday.com/mobile/200717104029071.html","thumbnail_pic_s":"https://09imgmini.eastday.com/mobile/20200717/20200717104029_2b21c1a01b60e8cb2b559c528b3faaba_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20200717/20200717104029_2b21c1a01b60e8cb2b559c528b3faaba_14_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20200717/20200717104029_2b21c1a01b60e8cb2b559c528b3faaba_2_mwpm_03200403.jpg"},{"uniquekey":"523e2ec24e166d543535b1cb9d4fef7f","title":"专访黄轩：不断突破，不断\u201c美出圈\u201d","date":"2020-07-17 10:37","category":"头条","author_name":"网易时尚","url":"https://mini.eastday.com/mobile/200717103738795.html","thumbnail_pic_s":"https://02imgmini.eastday.com/mobile/20200717/20200717103738_14e945944d31f6370aa7f22a84f2718b_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20200717/20200717103738_14e945944d31f6370aa7f22a84f2718b_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20200717/20200717103738_14e945944d31f6370aa7f22a84f2718b_3_mwpm_03200403.jpg"},{"uniquekey":"10a92e69b63e45e8b67d45a81c320175","title":"潘长江18岁照片被曝光，年轻时给十个女同学塞照片，却遇尴尬","date":"2020-07-17 10:33","category":"头条","author_name":"一论电影","url":"https://mini.eastday.com/mobile/200717103335663.html","thumbnail_pic_s":"https://07imgmini.eastday.com/mobile/20200717/2020071710_c56925c97cf048e4b134d0a498809084_1566_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20200717/2020071710_4d5d90f1d30f4700bd6870eb21f47b96_2513_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20200717/2020071710_9604818bfa7d4f3784f892ea8fc1cccc_5781_mwpm_03200403.jpg"},{"uniquekey":"975d99c3ffdf770ebf0a6b4be3490f31","title":"不寻常的燕青：谁都没他长得帅，谁都不如他会玩，谁都别想糊弄他","date":"2020-07-17 10:33","category":"头条","author_name":"川说历史","url":"https://mini.eastday.com/mobile/200717103318492.html","thumbnail_pic_s":"https://07imgmini.eastday.com/mobile/20200717/2020071710_03427d5af11d4f4fa04aaa03bc0242ad_8241_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20200717/2020071710_edd26aaa0b8c495fae8cdbee0a91e138_0754_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20200717/2020071710_6975d4b0b0ad46f3825d4c317aadc98a_8781_cover_mwpm_03200403.jpg"},{"uniquekey":"47f816d6bc92815e45bdecfcc3e168f1","title":"巴萨1-2揪出头号罪魁！昏帅难辞其咎，齐达内根本没把他当回事","date":"2020-07-17 10:33","category":"头条","author_name":"游戏打卡论","url":"https://mini.eastday.com/mobile/200717103306845.html","thumbnail_pic_s":"https://06imgmini.eastday.com/mobile/20200717/20200717103306_48212b2847cc7b413273c8ee1b04d8c0_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20200717/20200717103306_48212b2847cc7b413273c8ee1b04d8c0_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20200717/20200717103306_48212b2847cc7b413273c8ee1b04d8c0_4_mwpm_03200403.jpg"},{"uniquekey":"8deb598f4d0e45633aa35666a042b4c9","title":"吃了30几年面条，就服这一种吃法，拿肉都不换，出锅抢着吃","date":"2020-07-17 10:32","category":"头条","author_name":"美食美刻","url":"https://mini.eastday.com/mobile/200717103214831.html","thumbnail_pic_s":"https://04imgmini.eastday.com/mobile/20200717/20200717103214_5b5c4a9e72c19d0e964906553d29caf4_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20200717/20200717103214_5b5c4a9e72c19d0e964906553d29caf4_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20200717/20200717103214_5b5c4a9e72c19d0e964906553d29caf4_2_mwpm_03200403.jpg"},{"uniquekey":"18185745855d278ac6b309a4468d296b","title":"顺义区金融办线上签约加速结对帮扶 金企携手助力脱贫攻坚","date":"2020-07-17 10:28","category":"头条","author_name":"北青社区直播","url":"https://mini.eastday.com/mobile/200717102821394.html","thumbnail_pic_s":"https://09imgmini.eastday.com/mobile/20200717/20200717102821_3925f8bf327c9d2b57bbd4659a43784d_1_mwpm_03200403.jpg"},{"uniquekey":"4c0a6a2e2ea5cc4f33585fc3e2c0e3e4","title":"下个月发布！积木熊联名 Dunk SB 规格超高","date":"2020-07-17 10:26","category":"头条","author_name":"DUNKHOME","url":"https://mini.eastday.com/mobile/200717102652415.html","thumbnail_pic_s":"https://04imgmini.eastday.com/mobile/20200717/20200717102652_d3a02cdba0a40cfc8b4b2d3af5160294_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20200717/20200717102652_d3a02cdba0a40cfc8b4b2d3af5160294_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20200717/20200717102652_d3a02cdba0a40cfc8b4b2d3af5160294_4_mwpm_03200403.jpg"},{"uniquekey":"349170405228a4a93f8ce2fbb20ad5b9","title":"被问及学生开课问题 白宫新闻秘书：\u201c科学\u201d不应该阻止重新开学","date":"2020-07-17 10:24","category":"头条","author_name":"环球网","url":"https://mini.eastday.com/mobile/200717102415613.html","thumbnail_pic_s":"https://09imgmini.eastday.com/mobile/20200717/20200717102415_91aeaff43b25c994b2deebee6bdb1b28_1_mwpm_03200403.jpg"},{"uniquekey":"5e0c4974992f82ac3cdb434628a76d0c","title":"探访福州乡村博物馆：老物件演绎乡村\u201c前世今生\u201d","date":"2020-07-17 10:23","category":"头条","author_name":"中国新闻网","url":"https://mini.eastday.com/mobile/200717102311883.html","thumbnail_pic_s":"https://07imgmini.eastday.com/mobile/20200717/20200717102311_836bde013f1dd3f7dbfdb97e4bd45054_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20200717/20200717102311_836bde013f1dd3f7dbfdb97e4bd45054_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20200717/20200717102311_836bde013f1dd3f7dbfdb97e4bd45054_5_mwpm_03200403.jpg"},{"uniquekey":"fddc5457195ea2611e2a0eb0be696194","title":"上半年银行结售汇顺差786亿美元","date":"2020-07-17 10:17","category":"头条","author_name":"北青网","url":"https://mini.eastday.com/mobile/200717101700180.html","thumbnail_pic_s":"https://06imgmini.eastday.com/mobile/20200717/20200717101700_2f48e3774b83e1c18f4c394c43f4abe9_1_mwpm_03200403.jpg"},{"uniquekey":"a9ab9d5d62ecade8cb0b8fd49ced639d","title":"退休前1个月，他倒在了自己的\u201c贪欲\u201d上","date":"2020-07-17 10:14","category":"头条","author_name":"台州交通广播","url":"https://mini.eastday.com/mobile/200717101428276.html","thumbnail_pic_s":"https://02imgmini.eastday.com/mobile/20200717/20200717101428_3a9c119279a27082e05dadf82de70966_1_mwpm_03200403.jpg"},{"uniquekey":"7b6480db671cddc1a6a4bd5e4c5acb75","title":"\u201c万能\u201d红烧汁，学会了红烧鱼、红烧茄子、红烧肉，红烧啥都好吃","date":"2020-07-17 10:13","category":"头条","author_name":"陈王奋起挥黄钺","url":"https://mini.eastday.com/mobile/200717101350785.html","thumbnail_pic_s":"https://06imgmini.eastday.com/mobile/20200717/20200717101350_31a0c9c580e5abef01705262b6408bdd_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20200717/20200717101350_31a0c9c580e5abef01705262b6408bdd_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20200717/20200717101350_31a0c9c580e5abef01705262b6408bdd_2_mwpm_03200403.jpg"},{"uniquekey":"605efa0ca7970343256d2a5a9ea29bb0","title":"瓦尔德内尔最后的奥运会高光时刻，胜马琳负王励勤，无缘铜牌","date":"2020-07-17 10:12","category":"头条","author_name":"乒乓网","url":"https://mini.eastday.com/mobile/200717101257673.html","thumbnail_pic_s":"https://01imgmini.eastday.com/mobile/20200717/20200717101257_dc4c67d7794c436ad770630c3bf2209d_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20200717/20200717101257_dc4c67d7794c436ad770630c3bf2209d_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20200717/20200717101257_dc4c67d7794c436ad770630c3bf2209d_3_mwpm_03200403.jpg"},{"uniquekey":"b4e1c5789ca47e83f8224fbf54bb60df","title":"长征五号遥四运载火箭垂直转运至发射区","date":"2020-07-17 10:11","category":"头条","author_name":"人民日报","url":"https://mini.eastday.com/mobile/200717101135607.html","thumbnail_pic_s":"https://07imgmini.eastday.com/mobile/20200717/20200717101135_312c76d5d425e07cdbbf7bb707537f0c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20200717/20200717101135_c62439210070e43cb39a67c66adf08de_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20200717/20200717101135_ad84d965763e6feb815b8ef774768e20_3_mwpm_03200403.jpg"},{"uniquekey":"45de8995352b66bd5ed94e1547f85494","title":"5 月外资流入美股规模创新高 中国三个月来首度增持美债","date":"2020-07-17 10:09","category":"头条","author_name":"环球外汇","url":"https://mini.eastday.com/mobile/200717100947178.html","thumbnail_pic_s":"https://00imgmini.eastday.com/mobile/20200717/20200717100947_7c48e9e1db3726e1ebb572889b5183ed_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20200717/20200717100947_7c48e9e1db3726e1ebb572889b5183ed_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20200717/20200717100947_7c48e9e1db3726e1ebb572889b5183ed_4_mwpm_03200403.jpg"},{"uniquekey":"8cccccc6283ff4a40d87574ea5f86d23","title":"77人确诊！东京一剧场暴发集体感染 有演员身体不适仍坚持上台","date":"2020-07-17 10:07","category":"头条","author_name":"海外网","url":"https://mini.eastday.com/mobile/200717100731038.html","thumbnail_pic_s":"https://05imgmini.eastday.com/mobile/20200717/20200717100731_586945cab3e4fa7e85e5bdde2c57bce3_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20200717/20200717100731_586945cab3e4fa7e85e5bdde2c57bce3_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20200717/20200717100731_586945cab3e4fa7e85e5bdde2c57bce3_2_mwpm_03200403.jpg"},{"uniquekey":"5912b25316722a07f3742d6f3add794e","title":"家人换得4头牛，肯尼亚12岁女孩一个月先后嫁人两次","date":"2020-07-17 10:07","category":"头条","author_name":"环球时报新媒体","url":"https://mini.eastday.com/mobile/200717100730770.html","thumbnail_pic_s":"https://07imgmini.eastday.com/mobile/20200717/20200717100730_aa3295a935575fe176d0ed9969ec0607_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20200717/20200717100730_aa3295a935575fe176d0ed9969ec0607_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20200717/20200717100730_aa3295a935575fe176d0ed9969ec0607_3_mwpm_03200403.jpg"},{"uniquekey":"1a06f7293b997f5637f0540bd7f2df79","title":"大连人刮起青春旋风！新C罗+中国版大空翼正在崛起路途","date":"2020-07-17 10:05","category":"头条","author_name":"菱镜头","url":"https://mini.eastday.com/mobile/200717100547267.html","thumbnail_pic_s":"https://03imgmini.eastday.com/mobile/20200717/20200717100547_1e8ad3543a1d9b30dc6f949b5cf8ab1d_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20200717/20200717100547_1e8ad3543a1d9b30dc6f949b5cf8ab1d_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20200717/20200717100547_1e8ad3543a1d9b30dc6f949b5cf8ab1d_2_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"e2f4c884ac1d8a52a0f79f6c40292618","title":"美疾控中心举出实例证明，戴口罩真有效！呼吁民众出行戴上口罩","date":"2020-07-17 11:17","category":"头条","author_name":"北京晚报","url":"https://mini.eastday.com/mobile/200717111744963.html","thumbnail_pic_s":"https://04imgmini.eastday.com/mobile/20200717/20200717111744_5a5a30d9684141d2ccda50061d98f358_1_mwpm_03200403.jpg"},{"uniquekey":"b8e87b607a539d9981c8dec15f981574","title":"天神下凡！巴萨耻辱之夜唯有他可昂首离开，逆天表现无愧世界最佳","date":"2020-07-17 11:13","category":"头条","author_name":"游戏打卡论","url":"https://mini.eastday.com/mobile/200717111310222.html","thumbnail_pic_s":"https://00imgmini.eastday.com/mobile/20200717/20200717111310_4f44625acb6ed24272d26b62a2cc8493_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20200717/20200717111310_4f44625acb6ed24272d26b62a2cc8493_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20200717/20200717111310_4f44625acb6ed24272d26b62a2cc8493_4_mwpm_03200403.jpg"},{"uniquekey":"a59def512bd84574101a234cc3dba784","title":"CBA积分榜：季后赛晋级再增三队，仅剩两席位前12还有悬念吗？","date":"2020-07-17 11:07","category":"头条","author_name":"CBA篮球前线TB","url":"https://mini.eastday.com/mobile/200717110706168.html","thumbnail_pic_s":"https://05imgmini.eastday.com/mobile/20200717/20200717110706_398f24ef4c389f7d6ce2c128424e5814_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20200717/20200717110706_398f24ef4c389f7d6ce2c128424e5814_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20200717/20200717110706_398f24ef4c389f7d6ce2c128424e5814_2_mwpm_03200403.jpg"},{"uniquekey":"73267c63c95aec0200325d53f87b283f","title":"昨天 中方为日本说了句公道话","date":"2020-07-17 11:00","category":"头条","author_name":"环球时报","url":"https://mini.eastday.com/mobile/200717110001016.html","thumbnail_pic_s":"https://05imgmini.eastday.com/mobile/20200717/20200717110001_b1e420aefa0a77925502dfc8eeb5f0a5_1_mwpm_03200403.jpg"},{"uniquekey":"7515b92ce12971b12e14be75fcc6e493","title":"《浪姐》出道名单已内定？有靠山的她，果真不太一样","date":"2020-07-17 10:57","category":"头条","author_name":"快资讯","url":"https://mini.eastday.com/mobile/200717105742307.html","thumbnail_pic_s":"https://07imgmini.eastday.com/mobile/20200717/20200717105742_2d413c6c5c3c704ba4dd77c33208c6b8_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20200717/20200717105742_2d413c6c5c3c704ba4dd77c33208c6b8_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20200717/20200717105742_2d413c6c5c3c704ba4dd77c33208c6b8_3_mwpm_03200403.jpg"},{"uniquekey":"35c940363a774971276288aa6f224f3f","title":"李世民去世4年后，三位驸马被杀街市之中，唐高宗的做法很有深意","date":"2020-07-17 10:53","category":"头条","author_name":"博史通今","url":"https://mini.eastday.com/mobile/200717105335610.html","thumbnail_pic_s":"https://04imgmini.eastday.com/mobile/20200717/20200717105335_a6b7a604085bc2af89c8032ab9797de5_9_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20200717/20200717105335_a6b7a604085bc2af89c8032ab9797de5_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20200717/20200717105335_a6b7a604085bc2af89c8032ab9797de5_4_mwpm_03200403.jpg"},{"uniquekey":"839cee38f3c78e689b586a9134277485","title":"42岁黄奕晒写真气场十足，状态重回18岁，自称是\"幸存者\"","date":"2020-07-17 10:53","category":"头条","author_name":"时尚焦点社","url":"https://mini.eastday.com/mobile/200717105326560.html","thumbnail_pic_s":"https://00imgmini.eastday.com/mobile/20200717/20200717105326_803f5277955c2bc2f88d233e0f944e75_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20200717/20200717105326_803f5277955c2bc2f88d233e0f944e75_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20200717/20200717105326_803f5277955c2bc2f88d233e0f944e75_3_mwpm_03200403.jpg"},{"uniquekey":"aab60ffe1eecebe4372075984ff48833","title":"荣耀一连发布5款新机，价格从1099元到5199元，却没有一款是手机","date":"2020-07-17 10:52","category":"头条","author_name":"闲搞机","url":"https://mini.eastday.com/mobile/200717105244427.html","thumbnail_pic_s":"https://05imgmini.eastday.com/mobile/20200717/20200717105244_53454936513cf60d7aef5dfbf7b7958c_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20200717/20200717105244_53454936513cf60d7aef5dfbf7b7958c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20200717/20200717105244_53454936513cf60d7aef5dfbf7b7958c_5_mwpm_03200403.jpg"},{"uniquekey":"fa19c043320d5cc4900615ae2161da75","title":"94斤杨幂演绎啥叫\u201c肉长对了地方\u201d，这样的魔鬼身材谁不爱？","date":"2020-07-17 10:50","category":"头条","author_name":"小香风看娱乐","url":"https://mini.eastday.com/mobile/200717105038070.html","thumbnail_pic_s":"https://01imgmini.eastday.com/mobile/20200717/20200717105038_984532910ff04e5f6c7473192ce08a0c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20200717/20200717105038_984532910ff04e5f6c7473192ce08a0c_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20200717/20200717105038_984532910ff04e5f6c7473192ce08a0c_3_mwpm_03200403.jpg"},{"uniquekey":"d7b9d4a313038ecd2b82bf3ac3f7b993","title":"17斤重！富阳村民捡到一条娃娃鱼，它到底从哪里来的？","date":"2020-07-17 10:50","category":"头条","author_name":"青年时报","url":"https://mini.eastday.com/mobile/200717105029172.html","thumbnail_pic_s":"https://08imgmini.eastday.com/mobile/20200717/20200717105029_9fde58e3d208cd403296e6bc5a8632cc_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20200717/20200717105029_9fde58e3d208cd403296e6bc5a8632cc_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20200717/20200717105029_9fde58e3d208cd403296e6bc5a8632cc_2_mwpm_03200403.jpg"},{"uniquekey":"71d84f367ee89df2bf02e8b113108f8d","title":"一夜之间消失无踪的埃及古城，千年后，竟然在海底被科学家发现","date":"2020-07-17 10:46","category":"头条","author_name":"邓海春","url":"https://mini.eastday.com/mobile/200717104605299.html","thumbnail_pic_s":"https://04imgmini.eastday.com/mobile/20200717/20200717104605_db65c859a48342a0f47fcf88f2bf16af_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20200717/20200717104605_db65c859a48342a0f47fcf88f2bf16af_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20200717/20200717104605_db65c859a48342a0f47fcf88f2bf16af_7_mwpm_03200403.jpg"},{"uniquekey":"169406eb999c933b0d9b61b4f98ace68","title":"夏天不要错过这菜，炒一炒就上桌，鲜香脆嫩很下饭，好吃停不下筷","date":"2020-07-17 10:40","category":"头条","author_name":"我叫一尾鱼","url":"https://mini.eastday.com/mobile/200717104029071.html","thumbnail_pic_s":"https://09imgmini.eastday.com/mobile/20200717/20200717104029_2b21c1a01b60e8cb2b559c528b3faaba_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20200717/20200717104029_2b21c1a01b60e8cb2b559c528b3faaba_14_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20200717/20200717104029_2b21c1a01b60e8cb2b559c528b3faaba_2_mwpm_03200403.jpg"},{"uniquekey":"523e2ec24e166d543535b1cb9d4fef7f","title":"专访黄轩：不断突破，不断\u201c美出圈\u201d","date":"2020-07-17 10:37","category":"头条","author_name":"网易时尚","url":"https://mini.eastday.com/mobile/200717103738795.html","thumbnail_pic_s":"https://02imgmini.eastday.com/mobile/20200717/20200717103738_14e945944d31f6370aa7f22a84f2718b_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20200717/20200717103738_14e945944d31f6370aa7f22a84f2718b_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20200717/20200717103738_14e945944d31f6370aa7f22a84f2718b_3_mwpm_03200403.jpg"},{"uniquekey":"10a92e69b63e45e8b67d45a81c320175","title":"潘长江18岁照片被曝光，年轻时给十个女同学塞照片，却遇尴尬","date":"2020-07-17 10:33","category":"头条","author_name":"一论电影","url":"https://mini.eastday.com/mobile/200717103335663.html","thumbnail_pic_s":"https://07imgmini.eastday.com/mobile/20200717/2020071710_c56925c97cf048e4b134d0a498809084_1566_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20200717/2020071710_4d5d90f1d30f4700bd6870eb21f47b96_2513_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20200717/2020071710_9604818bfa7d4f3784f892ea8fc1cccc_5781_mwpm_03200403.jpg"},{"uniquekey":"975d99c3ffdf770ebf0a6b4be3490f31","title":"不寻常的燕青：谁都没他长得帅，谁都不如他会玩，谁都别想糊弄他","date":"2020-07-17 10:33","category":"头条","author_name":"川说历史","url":"https://mini.eastday.com/mobile/200717103318492.html","thumbnail_pic_s":"https://07imgmini.eastday.com/mobile/20200717/2020071710_03427d5af11d4f4fa04aaa03bc0242ad_8241_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20200717/2020071710_edd26aaa0b8c495fae8cdbee0a91e138_0754_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20200717/2020071710_6975d4b0b0ad46f3825d4c317aadc98a_8781_cover_mwpm_03200403.jpg"},{"uniquekey":"47f816d6bc92815e45bdecfcc3e168f1","title":"巴萨1-2揪出头号罪魁！昏帅难辞其咎，齐达内根本没把他当回事","date":"2020-07-17 10:33","category":"头条","author_name":"游戏打卡论","url":"https://mini.eastday.com/mobile/200717103306845.html","thumbnail_pic_s":"https://06imgmini.eastday.com/mobile/20200717/20200717103306_48212b2847cc7b413273c8ee1b04d8c0_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20200717/20200717103306_48212b2847cc7b413273c8ee1b04d8c0_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20200717/20200717103306_48212b2847cc7b413273c8ee1b04d8c0_4_mwpm_03200403.jpg"},{"uniquekey":"8deb598f4d0e45633aa35666a042b4c9","title":"吃了30几年面条，就服这一种吃法，拿肉都不换，出锅抢着吃","date":"2020-07-17 10:32","category":"头条","author_name":"美食美刻","url":"https://mini.eastday.com/mobile/200717103214831.html","thumbnail_pic_s":"https://04imgmini.eastday.com/mobile/20200717/20200717103214_5b5c4a9e72c19d0e964906553d29caf4_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20200717/20200717103214_5b5c4a9e72c19d0e964906553d29caf4_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20200717/20200717103214_5b5c4a9e72c19d0e964906553d29caf4_2_mwpm_03200403.jpg"},{"uniquekey":"18185745855d278ac6b309a4468d296b","title":"顺义区金融办线上签约加速结对帮扶 金企携手助力脱贫攻坚","date":"2020-07-17 10:28","category":"头条","author_name":"北青社区直播","url":"https://mini.eastday.com/mobile/200717102821394.html","thumbnail_pic_s":"https://09imgmini.eastday.com/mobile/20200717/20200717102821_3925f8bf327c9d2b57bbd4659a43784d_1_mwpm_03200403.jpg"},{"uniquekey":"4c0a6a2e2ea5cc4f33585fc3e2c0e3e4","title":"下个月发布！积木熊联名 Dunk SB 规格超高","date":"2020-07-17 10:26","category":"头条","author_name":"DUNKHOME","url":"https://mini.eastday.com/mobile/200717102652415.html","thumbnail_pic_s":"https://04imgmini.eastday.com/mobile/20200717/20200717102652_d3a02cdba0a40cfc8b4b2d3af5160294_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20200717/20200717102652_d3a02cdba0a40cfc8b4b2d3af5160294_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20200717/20200717102652_d3a02cdba0a40cfc8b4b2d3af5160294_4_mwpm_03200403.jpg"},{"uniquekey":"349170405228a4a93f8ce2fbb20ad5b9","title":"被问及学生开课问题 白宫新闻秘书：\u201c科学\u201d不应该阻止重新开学","date":"2020-07-17 10:24","category":"头条","author_name":"环球网","url":"https://mini.eastday.com/mobile/200717102415613.html","thumbnail_pic_s":"https://09imgmini.eastday.com/mobile/20200717/20200717102415_91aeaff43b25c994b2deebee6bdb1b28_1_mwpm_03200403.jpg"},{"uniquekey":"5e0c4974992f82ac3cdb434628a76d0c","title":"探访福州乡村博物馆：老物件演绎乡村\u201c前世今生\u201d","date":"2020-07-17 10:23","category":"头条","author_name":"中国新闻网","url":"https://mini.eastday.com/mobile/200717102311883.html","thumbnail_pic_s":"https://07imgmini.eastday.com/mobile/20200717/20200717102311_836bde013f1dd3f7dbfdb97e4bd45054_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20200717/20200717102311_836bde013f1dd3f7dbfdb97e4bd45054_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20200717/20200717102311_836bde013f1dd3f7dbfdb97e4bd45054_5_mwpm_03200403.jpg"},{"uniquekey":"fddc5457195ea2611e2a0eb0be696194","title":"上半年银行结售汇顺差786亿美元","date":"2020-07-17 10:17","category":"头条","author_name":"北青网","url":"https://mini.eastday.com/mobile/200717101700180.html","thumbnail_pic_s":"https://06imgmini.eastday.com/mobile/20200717/20200717101700_2f48e3774b83e1c18f4c394c43f4abe9_1_mwpm_03200403.jpg"},{"uniquekey":"a9ab9d5d62ecade8cb0b8fd49ced639d","title":"退休前1个月，他倒在了自己的\u201c贪欲\u201d上","date":"2020-07-17 10:14","category":"头条","author_name":"台州交通广播","url":"https://mini.eastday.com/mobile/200717101428276.html","thumbnail_pic_s":"https://02imgmini.eastday.com/mobile/20200717/20200717101428_3a9c119279a27082e05dadf82de70966_1_mwpm_03200403.jpg"},{"uniquekey":"7b6480db671cddc1a6a4bd5e4c5acb75","title":"\u201c万能\u201d红烧汁，学会了红烧鱼、红烧茄子、红烧肉，红烧啥都好吃","date":"2020-07-17 10:13","category":"头条","author_name":"陈王奋起挥黄钺","url":"https://mini.eastday.com/mobile/200717101350785.html","thumbnail_pic_s":"https://06imgmini.eastday.com/mobile/20200717/20200717101350_31a0c9c580e5abef01705262b6408bdd_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20200717/20200717101350_31a0c9c580e5abef01705262b6408bdd_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20200717/20200717101350_31a0c9c580e5abef01705262b6408bdd_2_mwpm_03200403.jpg"},{"uniquekey":"605efa0ca7970343256d2a5a9ea29bb0","title":"瓦尔德内尔最后的奥运会高光时刻，胜马琳负王励勤，无缘铜牌","date":"2020-07-17 10:12","category":"头条","author_name":"乒乓网","url":"https://mini.eastday.com/mobile/200717101257673.html","thumbnail_pic_s":"https://01imgmini.eastday.com/mobile/20200717/20200717101257_dc4c67d7794c436ad770630c3bf2209d_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20200717/20200717101257_dc4c67d7794c436ad770630c3bf2209d_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20200717/20200717101257_dc4c67d7794c436ad770630c3bf2209d_3_mwpm_03200403.jpg"},{"uniquekey":"b4e1c5789ca47e83f8224fbf54bb60df","title":"长征五号遥四运载火箭垂直转运至发射区","date":"2020-07-17 10:11","category":"头条","author_name":"人民日报","url":"https://mini.eastday.com/mobile/200717101135607.html","thumbnail_pic_s":"https://07imgmini.eastday.com/mobile/20200717/20200717101135_312c76d5d425e07cdbbf7bb707537f0c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20200717/20200717101135_c62439210070e43cb39a67c66adf08de_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20200717/20200717101135_ad84d965763e6feb815b8ef774768e20_3_mwpm_03200403.jpg"},{"uniquekey":"45de8995352b66bd5ed94e1547f85494","title":"5 月外资流入美股规模创新高 中国三个月来首度增持美债","date":"2020-07-17 10:09","category":"头条","author_name":"环球外汇","url":"https://mini.eastday.com/mobile/200717100947178.html","thumbnail_pic_s":"https://00imgmini.eastday.com/mobile/20200717/20200717100947_7c48e9e1db3726e1ebb572889b5183ed_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20200717/20200717100947_7c48e9e1db3726e1ebb572889b5183ed_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20200717/20200717100947_7c48e9e1db3726e1ebb572889b5183ed_4_mwpm_03200403.jpg"},{"uniquekey":"8cccccc6283ff4a40d87574ea5f86d23","title":"77人确诊！东京一剧场暴发集体感染 有演员身体不适仍坚持上台","date":"2020-07-17 10:07","category":"头条","author_name":"海外网","url":"https://mini.eastday.com/mobile/200717100731038.html","thumbnail_pic_s":"https://05imgmini.eastday.com/mobile/20200717/20200717100731_586945cab3e4fa7e85e5bdde2c57bce3_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20200717/20200717100731_586945cab3e4fa7e85e5bdde2c57bce3_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20200717/20200717100731_586945cab3e4fa7e85e5bdde2c57bce3_2_mwpm_03200403.jpg"},{"uniquekey":"5912b25316722a07f3742d6f3add794e","title":"家人换得4头牛，肯尼亚12岁女孩一个月先后嫁人两次","date":"2020-07-17 10:07","category":"头条","author_name":"环球时报新媒体","url":"https://mini.eastday.com/mobile/200717100730770.html","thumbnail_pic_s":"https://07imgmini.eastday.com/mobile/20200717/20200717100730_aa3295a935575fe176d0ed9969ec0607_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20200717/20200717100730_aa3295a935575fe176d0ed9969ec0607_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20200717/20200717100730_aa3295a935575fe176d0ed9969ec0607_3_mwpm_03200403.jpg"},{"uniquekey":"1a06f7293b997f5637f0540bd7f2df79","title":"大连人刮起青春旋风！新C罗+中国版大空翼正在崛起路途","date":"2020-07-17 10:05","category":"头条","author_name":"菱镜头","url":"https://mini.eastday.com/mobile/200717100547267.html","thumbnail_pic_s":"https://03imgmini.eastday.com/mobile/20200717/20200717100547_1e8ad3543a1d9b30dc6f949b5cf8ab1d_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20200717/20200717100547_1e8ad3543a1d9b30dc6f949b5cf8ab1d_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20200717/20200717100547_1e8ad3543a1d9b30dc6f949b5cf8ab1d_2_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : e2f4c884ac1d8a52a0f79f6c40292618
             * title : 美疾控中心举出实例证明，戴口罩真有效！呼吁民众出行戴上口罩
             * date : 2020-07-17 11:17
             * category : 头条
             * author_name : 北京晚报
             * url : https://mini.eastday.com/mobile/200717111744963.html
             * thumbnail_pic_s : https://04imgmini.eastday.com/mobile/20200717/20200717111744_5a5a30d9684141d2ccda50061d98f358_1_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://00imgmini.eastday.com/mobile/20200717/20200717111310_4f44625acb6ed24272d26b62a2cc8493_2_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://00imgmini.eastday.com/mobile/20200717/20200717111310_4f44625acb6ed24272d26b62a2cc8493_4_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
