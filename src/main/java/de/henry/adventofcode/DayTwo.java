package de.henry.adventofcode;

public class DayTwo {
	
	private static final String INPUT = "14-15 v: vdvvvvvsvvvvvfpv\n"
			+ "3-11 k: kkqkkfkkvkgfknkx\n"
			+ "6-10 j: jjjjjjjjjj\n"
			+ "5-10 s: nskdmzwrmpmhsrzts\n"
			+ "13-15 v: vvvvvvkvvvvjzvv\n"
			+ "11-13 h: hhhhhbhhhhdhhh\n"
			+ "14-15 r: rrrrrrrrzrrrrrtl\n"
			+ "2-9 c: llhctjgbz\n"
			+ "13-15 s: ssssxssssssssjs\n"
			+ "6-8 c: lccccqcc\n"
			+ "8-9 n: nnnnnmnch\n"
			+ "4-5 n: jnnnmmpxngbrknzb\n"
			+ "4-7 n: knlnqnnndnn\n"
			+ "13-18 g: ggggggggnggggggggggp\n"
			+ "5-6 m: mmmmgm\n"
			+ "5-10 l: lvlllglllpll\n"
			+ "7-12 z: pszgzqzzzzkw\n"
			+ "1-2 j: pjjqw\n"
			+ "15-16 n: nnnnnnnnnnnnnnpn\n"
			+ "8-14 z: mzzzjzzzzhzzzztznzz\n"
			+ "5-19 q: rnsdfgkqlqjdvrmtsqqh\n"
			+ "1-5 f: ffffff\n"
			+ "4-5 h: hhhhh\n"
			+ "1-7 g: cglgjgflgggxv\n"
			+ "2-3 g: gggpg\n"
			+ "2-8 m: gbsmqmmmsmh\n"
			+ "1-2 j: jjhkmqr\n"
			+ "10-12 s: sssstsstpsssssp\n"
			+ "9-15 k: tkbkkknkcnkgwkfkkkpk\n"
			+ "6-7 m: mmmmmmmm\n"
			+ "6-7 s: lsspssss\n"
			+ "9-13 k: kkgjrvkkkkkkmkkkkzd\n"
			+ "3-5 m: lbmmmzpwm\n"
			+ "2-12 x: xxgwxxtbttcxzmlfwx\n"
			+ "10-13 k: kkkkvkkkkkgkwkzkkkk\n"
			+ "10-12 t: ttdftttttrtqt\n"
			+ "4-8 z: zbzzzzzz\n"
			+ "8-11 g: gctgdgwtspgg\n"
			+ "2-5 l: lllvl\n"
			+ "4-5 f: fwdspfmtts\n"
			+ "5-8 z: zzhzmzzdzzz\n"
			+ "11-12 x: xxxxwxxxxxxx\n"
			+ "17-18 h: hhhhhhhhhhhhhhhhqm\n"
			+ "9-14 j: jtkjwxjgjjjjjzjq\n"
			+ "5-6 p: ddgdbkpdsd\n"
			+ "2-5 c: xczcczc\n"
			+ "6-15 t: ttgjktpwqthftfrt\n"
			+ "13-16 t: tttttttttttttttq\n"
			+ "9-11 t: tgttttttftttc\n"
			+ "4-9 z: zzmzzzzzzzzzc\n"
			+ "5-8 d: sddtvddb\n"
			+ "5-6 l: llllpd\n"
			+ "15-16 s: sssssssssssssssb\n"
			+ "14-16 p: ppppppppppppppph\n"
			+ "2-10 r: mjnczrrnlnv\n"
			+ "9-10 s: ssspsssssrd\n"
			+ "3-5 d: dddddq\n"
			+ "2-3 v: llfv\n"
			+ "7-12 n: dnnnlnbnnnncn\n"
			+ "5-6 g: gsgggg\n"
			+ "5-9 t: tltbtttttt\n"
			+ "1-20 r: rtqtcmmgzfqmxtxqhdrn\n"
			+ "2-6 l: hlkkll\n"
			+ "4-6 c: cwccccc\n"
			+ "3-4 c: gcrdcz\n"
			+ "1-8 v: vvlvdgpvg\n"
			+ "6-17 g: gjccgdglgzgtcggdx\n"
			+ "1-17 l: nlczbmbrwcvgtjmcvcq\n"
			+ "5-11 z: nzppckcknfwllzzzrpp\n"
			+ "6-11 s: smsdjvsssss\n"
			+ "3-4 t: cttt\n"
			+ "1-4 q: tbcq\n"
			+ "2-4 m: jmmmmm\n"
			+ "2-8 h: hhhhhhhm\n"
			+ "9-11 h: phrhhhvhchqhmhh\n"
			+ "6-9 v: vvvvvmvvrvvvvv\n"
			+ "1-2 f: nxfgjfffp\n"
			+ "5-8 w: wwwwtnckwd\n"
			+ "6-12 x: xxnxscxkxxtf\n"
			+ "8-11 l: lllllllllstmllllll\n"
			+ "9-11 p: ppppppppvtfpp\n"
			+ "5-17 f: ffvwffpkfjffbtlfnftl\n"
			+ "2-6 b: gbbgbbbbrbxk\n"
			+ "8-9 t: trtftttttt\n"
			+ "13-17 r: rrgrrvrrrrrbrrzrqr\n"
			+ "10-11 k: kkkkkkrkkkk\n"
			+ "9-11 c: cccccccccncc\n"
			+ "2-5 j: jdfwzrjjtjt\n"
			+ "10-13 r: zrrprxhrrxzmmrbr\n"
			+ "8-13 s: sssjsssgssssbs\n"
			+ "5-6 b: bbbhhkh\n"
			+ "8-9 z: fzrzzzzxgfz\n"
			+ "7-9 l: bllllmllhl\n"
			+ "5-11 g: mqbfgrlgxfgcgggjdstc\n"
			+ "4-11 m: mmmgmmmmmmmxms\n"
			+ "14-17 p: lpppppppppzpppppp\n"
			+ "7-9 d: ddddddddd\n"
			+ "14-15 n: nnnnnnnnnnnnntz\n"
			+ "8-17 n: nnnbgzqbnndnzfsnmsmj\n"
			+ "12-15 l: lllkqllwdxlllvl\n"
			+ "3-11 t: lpdztztgmdwtztj\n"
			+ "2-5 m: rslsm\n"
			+ "5-11 c: ckptcgwqshct\n"
			+ "3-4 v: vvvdv\n"
			+ "4-8 d: dddrhddhddd\n"
			+ "2-5 n: brnnnnn\n"
			+ "1-4 p: qtpp\n"
			+ "5-7 l: lxblllflwl\n"
			+ "16-17 t: ttttttttttttttthm\n"
			+ "5-18 h: hhhthhhhhhhhhhhhhh\n"
			+ "9-17 j: jjjjjjjjbnjjjjjjjjj\n"
			+ "6-7 g: gfggnggrgg\n"
			+ "4-6 n: nnnnwq\n"
			+ "8-9 z: zzzczxzpwzlzdcsz\n"
			+ "7-10 w: wwswwwvwwtwww\n"
			+ "6-8 w: whwwwwlww\n"
			+ "2-14 c: cpccccccrccccck\n"
			+ "1-3 t: bqtbfdrdltn\n"
			+ "3-8 w: qwjhwrnjwsb\n"
			+ "2-4 g: gghg\n"
			+ "2-11 d: htdtljjxrnddxbdnfkwf\n"
			+ "12-14 b: bgbglrlpckgsxbjvqm\n"
			+ "9-14 q: qqgvqqqqqqmqqq\n"
			+ "2-16 m: mbmmmmmmhmmmmmzsbm\n"
			+ "11-12 n: nnxnnnnnnnnn\n"
			+ "6-12 r: rbrfbrnrrrprrczrqr\n"
			+ "1-3 n: nmnqtz\n"
			+ "17-18 h: hhhhhhhhhhhhhhhhfs\n"
			+ "11-13 k: rkmkwrknzfkkm\n"
			+ "2-3 w: bwwwwz\n"
			+ "8-12 s: mssssssssssc\n"
			+ "8-10 f: vzpcxfdfvqjpdkdh\n"
			+ "1-2 b: kbbx\n"
			+ "2-11 d: gqddddcdddf\n"
			+ "3-9 z: lzzqztpzzlzlz\n"
			+ "8-12 k: gkkfkkkmpkkkkktk\n"
			+ "1-4 l: lsqm\n"
			+ "9-11 m: mmzmmmmmmmv\n"
			+ "16-18 f: fffchfffffffffffffw\n"
			+ "7-8 v: wfhbqvxrvqpqvv\n"
			+ "15-16 v: vvvvvvvvvvvvvvtvv\n"
			+ "1-8 c: scwcrqclccccc\n"
			+ "12-15 d: bpdvrddgdtfdgdd\n"
			+ "2-4 k: gkkk\n"
			+ "14-15 x: lxsxljxfxwxxjcwnxxv\n"
			+ "6-7 p: hjxqnppmknskpb\n"
			+ "7-13 b: bbbbbbcblbbbbbvb\n"
			+ "7-9 j: gjjjpjjjhvqj\n"
			+ "3-6 n: nnnnnnn\n"
			+ "7-12 h: wxlhhhbjhhhhxhm\n"
			+ "3-5 t: ttttt\n"
			+ "3-4 n: ntnn\n"
			+ "8-16 b: bhrjmbbbsbbbfbbbpbb\n"
			+ "4-10 p: npsjlpppzgncww\n"
			+ "4-6 p: pvpfxqp\n"
			+ "1-2 f: fvxjf\n"
			+ "3-6 t: trnktdttt\n"
			+ "3-5 v: vvvvvmd\n"
			+ "3-6 z: bzmdfpbwckf\n"
			+ "3-4 h: hhhh\n"
			+ "2-4 x: tshbsbxlkpgs\n"
			+ "1-4 p: ppppbppppppppppp\n"
			+ "2-4 c: cccwc\n"
			+ "6-11 w: sbwwwwwqwmkw\n"
			+ "1-2 f: bxff\n"
			+ "3-8 h: rshhnqkvhh\n"
			+ "2-4 l: lpllll\n"
			+ "9-13 m: ltlmvcnnmmgtm\n"
			+ "4-5 j: szjjjmjb\n"
			+ "6-11 h: hkhdhkhhhhh\n"
			+ "1-4 v: vvlq\n"
			+ "16-17 b: pbdnsbbxbxgbdcqcr\n"
			+ "1-18 n: nnnnnmbnnnnnnnnnnn\n"
			+ "7-12 p: ppwtxzpvpppf\n"
			+ "4-5 r: rrrrr\n"
			+ "13-14 s: sgmdvqpxqqtstgspskf\n"
			+ "4-7 h: hhhwchwh\n"
			+ "7-18 d: ddlddddhjhbdddjdddd\n"
			+ "4-6 l: llllll\n"
			+ "15-16 n: nnnnnnnnnnnnnnzn\n"
			+ "11-16 p: pppdplppppgpppmppppt\n"
			+ "4-5 w: fwzbn\n"
			+ "1-3 p: sjpfb\n"
			+ "3-4 b: bbgbb\n"
			+ "2-13 n: pdnnjnnnnnnnnnn\n"
			+ "6-11 w: wwwkwdwwvcmwg\n"
			+ "1-6 t: dhtmfk\n"
			+ "4-7 d: wgrtpqldqldl\n"
			+ "2-15 z: zjzzzzzzgzzzzjzpzh\n"
			+ "1-6 h: hshhch\n"
			+ "1-2 n: kdnnnnnqnnnnn\n"
			+ "6-8 m: mdfjcclk\n"
			+ "7-19 d: ddwdddddfnddddddddj\n"
			+ "12-15 q: snqnppbsfjzvkxgkfc\n"
			+ "6-7 n: nnnnnnn\n"
			+ "3-4 x: xxghmxsz\n"
			+ "5-6 t: tttgtsjts\n"
			+ "3-5 f: mftfffcgwc\n"
			+ "12-13 w: wpwwwwwwwwwzw\n"
			+ "3-7 m: mmmmmmmmm\n"
			+ "15-18 x: xxxtxxwdvxxxxxxxxkxs\n"
			+ "4-5 w: wnpwwzw\n"
			+ "17-19 n: nnnnnnnnnnnnqnnnndn\n"
			+ "7-8 d: ddddddrf\n"
			+ "9-11 t: ttqtttthttxttt\n"
			+ "1-4 c: gccbr\n"
			+ "5-11 w: wwwwtwmwwwwlw\n"
			+ "6-8 v: vvmwvhvxvgsvftv\n"
			+ "2-11 s: lkvssdschmsgqbbws\n"
			+ "3-7 k: kmkxkckvg\n"
			+ "3-10 l: llxllllllglrllhl\n"
			+ "1-3 b: gbbb\n"
			+ "18-19 v: vvvsvvvvvvvvvvvvvvv\n"
			+ "8-9 d: tzddvdddddd\n"
			+ "2-4 t: tgtbpcv\n"
			+ "1-3 r: hrzrt\n"
			+ "2-4 f: ffqq\n"
			+ "5-6 c: cccjzh\n"
			+ "3-4 j: jjln\n"
			+ "6-8 l: lllllllllll\n"
			+ "9-10 n: nnnnnnnnfr\n"
			+ "8-9 x: xxxxxxxvcx\n"
			+ "5-10 w: wpwwwbwwww\n"
			+ "14-15 p: pppppppppppdphrppp\n"
			+ "9-19 h: whhcthhxhhhhhhghjtwz\n"
			+ "9-13 z: zzzzzpzzzhtzvnzzzzz\n"
			+ "11-13 l: llllllllzlqql\n"
			+ "6-11 b: bhlwpmbbbjzbcxwzmtc\n"
			+ "2-3 q: fqqhfqr\n"
			+ "12-14 m: mmmmdmmmmmmmsm\n"
			+ "1-3 t: gggctqtfpxtrt\n"
			+ "2-3 k: kbkk\n"
			+ "11-14 d: dddddcdddfddddd\n"
			+ "8-19 n: pnnnjnnnwgnnnnsnnnd\n"
			+ "9-10 r: rrtrrrvrqrrrpr\n"
			+ "4-12 k: kxskkkckkkzkz\n"
			+ "1-10 h: tjvhhphpzhjrlhhht\n"
			+ "8-9 c: pkcccccmc\n"
			+ "3-5 h: slwlgwnhcxxdhk\n"
			+ "1-8 l: cllllllqll\n"
			+ "3-4 q: wzqthkjvqct\n"
			+ "4-6 d: ddddddddddd\n"
			+ "2-6 q: qqqbxm\n"
			+ "6-9 b: bbbbbbqbsw\n"
			+ "3-6 c: ccwkpdjccfvc\n"
			+ "9-10 r: rrrrtrrrrr\n"
			+ "1-5 d: phzdmtzshlz\n"
			+ "5-7 q: fqqqqqrqq\n"
			+ "4-5 v: vvvvr\n"
			+ "3-5 k: kkgkk\n"
			+ "3-7 h: wxhgkfhhhqnhdfhg\n"
			+ "5-7 m: mmmwmmmmm\n"
			+ "1-3 z: qsvrzwnxzvl\n"
			+ "7-12 x: tpzblhzfdmxqqmmjfwq\n"
			+ "9-12 m: mmmqmmmmmdmmmm\n"
			+ "15-18 t: ttttttttttttttthtt\n"
			+ "2-12 b: tblhkbgnbbfqvd\n"
			+ "2-3 m: rmqv\n"
			+ "8-17 m: jmcndnqmdjdtqnbvmpn\n"
			+ "5-14 l: lxlfvjnbllllmlllllsb\n"
			+ "4-5 r: rtlmrxxrrnrt\n"
			+ "6-7 k: kkksmkg\n"
			+ "16-19 q: bkwfqstbmqqhzqvqvcqd\n"
			+ "12-13 l: lllllllllllpll\n"
			+ "2-9 m: zgxdbmzrmbbdbw\n"
			+ "7-9 d: bdddddzdk\n"
			+ "18-19 g: wfwggwhxrnnspmvgjrg\n"
			+ "17-18 w: wwwwwwwwwwwwwwwwwwww\n"
			+ "2-6 z: kzzzfzbh\n"
			+ "3-4 c: pcqk\n"
			+ "5-6 t: tthtpx\n"
			+ "10-13 x: xxxxxxxtdtkxqxqxxxx\n"
			+ "1-2 b: qbwd\n"
			+ "13-19 l: llhxsxlllllpllllllfl\n"
			+ "14-15 n: nnnnmnnnnnnnnnqn\n"
			+ "6-7 m: mjmhsdmmm\n"
			+ "3-5 r: qqshck\n"
			+ "8-15 c: clbcccrccscccpcwcc\n"
			+ "9-12 k: kkcwkklkkkcnkkxkk\n"
			+ "4-5 v: vvvppvv\n"
			+ "2-8 t: dxtgttjj\n"
			+ "1-8 r: tqrlhfzk\n"
			+ "8-9 n: zhmtnfsrr\n"
			+ "10-15 d: ddddmldddzddgnk\n"
			+ "13-17 z: jzpzzzzzzzvwnzzbz\n"
			+ "1-5 d: ddkdd\n"
			+ "4-6 x: xsxgbf\n"
			+ "3-8 k: wkckkkcw\n"
			+ "5-7 r: ndprnrxrrrbzrpnrz\n"
			+ "4-6 n: nnnnnnn\n"
			+ "7-8 q: qbmxfhqqqqmhqqq\n"
			+ "9-10 k: swgkcrkdkkjfmkkkjl\n"
			+ "6-8 s: kzqbsxrchhvvfvkqhz\n"
			+ "3-4 h: hmgh\n"
			+ "10-11 b: bsbfbkbwbhh\n"
			+ "9-13 z: nnzzbvzzrzkjnbzqfzzp\n"
			+ "1-11 x: xsxnqgjsqzxxnxd\n"
			+ "12-13 m: mmmmmmmmmmmvm\n"
			+ "11-20 n: vjsnfnnsgnnnmnnnnnwn\n"
			+ "4-11 q: qqqhqnpqbnrqhpd\n"
			+ "10-16 s: hszrsssktsspdtsrssss\n"
			+ "1-4 m: ldmhj\n"
			+ "3-14 l: llxjlmllflzdbll\n"
			+ "11-17 m: mmmmmmmmmmmmmmpmmmm\n"
			+ "1-7 c: jcccccl\n"
			+ "15-16 x: xjxxxxxxxxxxxxxxx\n"
			+ "5-7 v: cvtvcvv\n"
			+ "7-12 p: npppqpgptpjkjpdp\n"
			+ "12-16 c: cwvmnknsbccvccrckqcf\n"
			+ "5-13 v: vrvvvjvvpvvvwvbv\n"
			+ "2-14 l: bkllllllllllldlllk\n"
			+ "4-6 x: qxxxpxs\n"
			+ "9-11 s: sbssssssssm\n"
			+ "7-8 q: vgctvvqq\n"
			+ "3-8 g: ggtgggggggg\n"
			+ "5-6 b: pbbctbbbvnbjbbb\n"
			+ "1-2 w: jwww\n"
			+ "12-14 z: zszzzzznzzztzz\n"
			+ "2-3 j: fnmgcjbjt\n"
			+ "4-9 c: cccphccccpthcwwc\n"
			+ "5-12 g: ggsgxggggsgqggggg\n"
			+ "4-5 v: vvvvvv\n"
			+ "8-17 q: hdhtqlwpzqqqqqpqqhq\n"
			+ "9-15 s: sschdsssnvssvss\n"
			+ "7-8 d: sdhkdtpcdwgddtdd\n"
			+ "1-2 d: ddjdd\n"
			+ "5-9 b: zbzbbbklzbbb\n"
			+ "9-10 g: gggggggggg\n"
			+ "2-4 t: kttt\n"
			+ "6-13 t: pttsttttttttzt\n"
			+ "16-17 h: hhhhhhhhmhhhhhhtdhh\n"
			+ "4-10 r: rmpldrbrqcfqrkhbnqc\n"
			+ "6-14 z: zjzcpzzxzzzctzjz\n"
			+ "6-17 v: hsfctvxwpgsvfnfxwncq\n"
			+ "14-16 p: ppppppppppppplpppppp\n"
			+ "15-18 l: lllllslllllllgnllf\n"
			+ "7-15 v: vvvvvvfpvnvvsvvgvv\n"
			+ "3-4 x: xxsx\n"
			+ "8-13 z: zzwzzrzzzzzqqz\n"
			+ "7-8 r: hrsrrrrzrb\n"
			+ "3-4 b: bzfg\n"
			+ "5-7 h: dhhthhhhr\n"
			+ "1-4 v: vcvv\n"
			+ "5-6 k: pkkkqkkk\n"
			+ "13-20 j: jjjjjsjjjjjjjjjjjjjj\n"
			+ "3-6 p: pgtpptpxptvc\n"
			+ "1-3 v: tvvvv\n"
			+ "6-15 b: mbbbbbbbbbbbbkbb\n"
			+ "11-15 q: qmqqqqqhqqqqqqqqdqcs\n"
			+ "2-6 g: dggggr\n"
			+ "1-4 j: jjldsjjhfg\n"
			+ "2-4 h: vhkwhhnhbhx\n"
			+ "3-5 z: zzzzzz\n"
			+ "2-4 s: stmw\n"
			+ "12-13 k: wkbcmmkhpklkdnnkdvk\n"
			+ "19-20 b: bbbbbbbbbbbbbbbbbbbj\n"
			+ "6-9 w: vwwwtcpwwgw\n"
			+ "3-5 j: jbsjpjj\n"
			+ "10-13 c: cdccqpccccccc\n"
			+ "7-9 q: qpqqqqqqw\n"
			+ "15-16 p: ppppppppppppppbd\n"
			+ "6-13 n: nnnnnqnnnnndknnnnnn\n"
			+ "11-14 t: ttttqtttttjtttt\n"
			+ "4-6 t: tttltz\n"
			+ "3-5 n: nnnrj\n"
			+ "2-13 h: hhhhhhshhmhlkh\n"
			+ "1-6 x: xxxxxcxxxx\n"
			+ "4-7 v: ddswdvq\n"
			+ "3-5 d: xjksdvdddddwcrqzj\n"
			+ "6-7 x: xxxxxfxx\n"
			+ "3-6 b: bbqbbll\n"
			+ "9-12 p: pppppppplppj\n"
			+ "12-13 w: wwwwwwwwwwwwzww\n"
			+ "5-11 q: qztqqwvldnm\n"
			+ "1-4 m: qmmj\n"
			+ "3-7 l: llpllwllt\n"
			+ "2-8 h: hmhhhhhrsfhh\n"
			+ "8-10 g: gggggggqgv\n"
			+ "5-7 g: pggzgggggggb\n"
			+ "4-7 v: gvvxvrv\n"
			+ "3-4 l: llkf\n"
			+ "2-6 q: wqzpqqvdhhjlhkhmwtft\n"
			+ "2-3 n: nnnrd\n"
			+ "1-5 h: kfqqk\n"
			+ "7-12 z: qczzzzdlclzzdpfgzzz\n"
			+ "2-4 m: vrjmnqrmrmvm\n"
			+ "4-6 h: hhhbkhpghh\n"
			+ "5-7 z: zzzzgwbz\n"
			+ "5-7 d: ddddkfdbdnd\n"
			+ "8-10 q: qqxqqgtxqwqg\n"
			+ "5-14 b: bbbbzbbrbbrbbnbbbbbb\n"
			+ "8-10 z: vzzpzkzzgzzzzz\n"
			+ "8-9 w: wwwwwwwwb\n"
			+ "5-11 d: ddqdhddgddddd\n"
			+ "2-9 h: fhhhhhhhhhh\n"
			+ "7-12 b: bbjbbwxbcwbbnb\n"
			+ "1-3 m: tmmdmmmm\n"
			+ "2-3 b: bqtnkbjhlrvz\n"
			+ "2-9 z: nzrbzzrzlzzzvzt\n"
			+ "2-4 v: vvmv\n"
			+ "9-10 q: fccjqpwhqqq\n"
			+ "2-12 q: qqqqqfqqqqqqvqqq\n"
			+ "1-4 c: cxnc\n"
			+ "5-6 q: qqzhqqzqqqj\n"
			+ "2-3 k: vkkk\n"
			+ "8-9 n: nnmnnnxnnnnnqtwp\n"
			+ "2-3 b: jrbzvcb\n"
			+ "4-5 w: wwlnk\n"
			+ "4-15 d: wdpddddmdddddddddd\n"
			+ "10-14 d: dddqdxfddjbfddd\n"
			+ "5-6 t: pttttmttp\n"
			+ "3-4 b: bbgdbbb\n"
			+ "5-6 b: rgtqbbb\n"
			+ "7-14 b: pwpbbhbvbzxfbbb\n"
			+ "6-10 p: zppvhbpmcpwpprp\n"
			+ "1-15 p: bpfdpppxxmkppppmg\n"
			+ "9-14 w: hmlxdbdcqmxxhw\n"
			+ "1-9 t: zrqqtdbwpqdd\n"
			+ "4-6 n: knrnlnznn\n"
			+ "4-9 l: gclwdmllglblnlzn\n"
			+ "5-7 c: ckccbvvgtlc\n"
			+ "8-11 p: ppppppppxpp\n"
			+ "13-14 w: wwwwwwwwwwwdwh\n"
			+ "17-18 k: kkkkkkkkkkkkkkkkkk\n"
			+ "7-11 c: qccmcnccccc\n"
			+ "2-7 m: vmbnrmmngtqkjlmmt\n"
			+ "9-12 m: mtmmmmmmmxnr\n"
			+ "8-12 j: rjjdjvdjjfhj\n"
			+ "14-16 h: hhlhwhhhhhhhhgbhh\n"
			+ "10-12 w: dxwwwwlwwwwkwlwpwdl\n"
			+ "1-3 w: wmwcwrfbpwtzwf\n"
			+ "1-6 j: bjjjjjjj\n"
			+ "8-13 f: ffffffffffffgf\n"
			+ "1-6 g: lghdgt\n"
			+ "6-8 s: sssslsfb\n"
			+ "16-17 c: cccccccccnmcccmkc\n"
			+ "3-4 z: zmzz\n"
			+ "8-11 c: cccccccdcccc\n"
			+ "8-15 p: lcnvhbjldhfsgwfvtbp\n"
			+ "3-4 q: qqqq\n"
			+ "5-7 b: bcpqbdq\n"
			+ "1-4 t: ttttttttttttdtttt\n"
			+ "3-14 v: cvlrwvzvjkdbdd\n"
			+ "4-8 l: fcdhlwwl\n"
			+ "4-5 m: mmmmpm\n"
			+ "3-4 h: hhqlhl\n"
			+ "5-6 r: mrrrqrr\n"
			+ "4-5 c: cvccc\n"
			+ "11-15 p: pppppppshpjpppszppp\n"
			+ "6-8 j: fjzbjjjjvkjj\n"
			+ "3-7 q: qqsqqqqq\n"
			+ "1-16 p: jpppqppppppvppdwp\n"
			+ "2-5 g: jgwlxzgbhpmqp\n"
			+ "5-6 p: pppppplppp\n"
			+ "7-18 r: wmbbsjrmmzzdlxbwcfhp\n"
			+ "1-4 w: wvwqn\n"
			+ "6-7 p: pppppcmp\n"
			+ "15-16 h: zhhhhhhhhhhhhhhhhh\n"
			+ "2-16 h: hrhhhhlthhwhqjhht\n"
			+ "14-17 k: kkkkkdkkkkxkkskkxkk\n"
			+ "15-16 d: dddddddddddddddf\n"
			+ "2-17 v: vwvvvvvvvvvbvvmvvr\n"
			+ "7-8 v: vvvvvvtd\n"
			+ "1-4 f: lftr\n"
			+ "2-4 h: hhrq\n"
			+ "10-15 s: qsnnssxsvtfssdssss\n"
			+ "16-17 n: nnnnnnnnnnnnnnnnn\n"
			+ "1-4 r: bldfswjgvrsf\n"
			+ "10-11 n: lnxknqwlnnxc\n"
			+ "9-14 k: tjxclnrddxnpmg\n"
			+ "3-10 v: tvvvqmvsvcvsc\n"
			+ "3-4 v: vnxrv\n"
			+ "1-6 k: kkgkdkmj\n"
			+ "3-4 h: jhbrh\n"
			+ "8-9 c: ctczkccknntcccrc\n"
			+ "13-14 t: ttsttdtcttttttj\n"
			+ "1-9 b: bfwjbbxbd\n"
			+ "9-10 m: xmdvtsbmgg\n"
			+ "5-6 w: wwwwww\n"
			+ "2-6 l: djlwlwkl\n"
			+ "5-6 h: hhvjtrkhh\n"
			+ "3-5 b: bsbbl\n"
			+ "5-7 p: vxpwppsppp\n"
			+ "2-4 d: zbnddd\n"
			+ "3-4 s: msjss\n"
			+ "4-7 l: llqllll\n"
			+ "6-18 w: wwwwwwwwwwwwwwwwwlw\n"
			+ "13-14 h: hqnlxqhfwlvhhh\n"
			+ "7-9 p: ppppppcphpp\n"
			+ "5-8 x: bjfxkbqxpzxhxwvxx\n"
			+ "4-5 h: hhhpphgh\n"
			+ "4-5 c: sczcccccc\n"
			+ "4-10 n: nnfnnnsdgnnsj\n"
			+ "5-6 j: jwjjmjj\n"
			+ "1-9 c: hcrlmrcdjwhqn\n"
			+ "3-5 x: xxjxvx\n"
			+ "7-13 x: xxvxxblxxnxxlx\n"
			+ "3-6 w: wwjwwwf\n"
			+ "14-18 m: mnmmmmmmmmmmmmjmmmm\n"
			+ "3-5 t: tslttjqvnb\n"
			+ "1-2 v: sfkvhj\n"
			+ "2-4 c: ccctc\n"
			+ "5-10 r: rrqptljvxtkrwsfdbr\n"
			+ "3-4 q: qbwqngvm\n"
			+ "1-4 t: nttnt\n"
			+ "8-10 f: fqmfrffftv\n"
			+ "6-7 h: hkhhhhhv\n"
			+ "9-17 f: hfzhbmrxsfwfxdffh\n"
			+ "1-10 t: tthttgtgtgttctt\n"
			+ "2-3 b: tlbsbcxzbfplpjlsvncg\n"
			+ "8-16 t: tdtttttpttttttttttt\n"
			+ "8-16 k: jkkmzlkkgvkkkwtj\n"
			+ "13-16 v: vvvvvvvnvvdvhvvw\n"
			+ "7-9 v: vvvvxvhlqvzmc\n"
			+ "4-6 l: gdjscq\n"
			+ "9-17 f: fffffqffsfffffffhff\n"
			+ "4-5 g: ggggb\n"
			+ "2-4 w: wnmh\n"
			+ "7-8 g: ggjgrqfgg\n"
			+ "11-13 k: rrkgxzkkqnljs\n"
			+ "11-15 v: vsvvvqvvvvwvvjcvvv\n"
			+ "13-15 c: ccccccccccccccvccc\n"
			+ "1-6 n: jpmcnjdbdn\n"
			+ "3-4 v: xvlffppmgzwvv\n"
			+ "6-12 j: jjjjjslsjbpj\n"
			+ "10-11 l: lrhljlqllldblll\n"
			+ "8-11 h: hdhghhczmxhhhhhw\n"
			+ "2-3 z: ztnt\n"
			+ "6-8 x: jxxxxqxmm\n"
			+ "2-6 n: nwnnntnnjt\n"
			+ "8-13 z: ztzzzzzbzzzzq\n"
			+ "4-13 v: vxvvvxvmvvvvvvhvv\n"
			+ "11-13 t: ntttftttxtstttwt\n"
			+ "5-6 d: dddznd\n"
			+ "10-15 t: trxttttttbbstttt\n"
			+ "2-4 t: tblp\n"
			+ "8-11 l: xllllllwlldl\n"
			+ "12-13 m: mmsmmmmmmmmvcm\n"
			+ "3-4 t: tthb\n"
			+ "10-12 c: cpsclccmccctccc\n"
			+ "11-12 k: pkkkrkkkkqkfkk\n"
			+ "11-13 v: vvbvvlvvvvvvt\n"
			+ "6-11 p: xkxfdpkkrdpb\n"
			+ "13-14 h: hhqskrdhrhphbb\n"
			+ "2-6 r: rdrrrr\n"
			+ "1-4 p: nppg\n"
			+ "5-6 h: hgpbhh\n"
			+ "4-5 l: mrgzlxlchgjgwrlmvxl\n"
			+ "6-11 b: bbbbbbbbbbbbb\n"
			+ "2-5 s: svsvss\n"
			+ "10-18 j: jjjdjjjjzjfjjjjjbj\n"
			+ "1-14 p: tjphtjfnbhhgrmzdp\n"
			+ "2-4 v: vvvv\n"
			+ "5-7 q: vqvnbqdqhwqxqv\n"
			+ "6-7 m: mmmmmlj\n"
			+ "9-10 g: ggggggggggg\n"
			+ "7-13 n: sqnjnnrnnfnnn\n"
			+ "2-4 f: fbrfkhfkfcgjfp\n"
			+ "2-3 b: wfwjlbx\n"
			+ "16-17 r: rrrrrrrrrdrrrrrrr\n"
			+ "3-7 b: vkksbzbbhpwb\n"
			+ "2-4 m: fmcr\n"
			+ "9-20 v: vfvvxnvvdwhvxvvvqlvj\n"
			+ "6-9 b: jgjrcbnftrlbhp\n"
			+ "4-9 x: hrqtpwzjxxx\n"
			+ "7-9 h: hhhhhxnhdh\n"
			+ "7-8 k: kkkkrtsphkk\n"
			+ "6-7 n: jnnnblnnj\n"
			+ "10-15 d: dddddddddkddddt\n"
			+ "2-8 p: npbdhcgpl\n"
			+ "9-10 x: xqxxxxxzxvx\n"
			+ "5-9 k: khtkkwkkxqm\n"
			+ "1-5 t: stttttttgttttt\n"
			+ "5-13 w: wwhfjkshrwfpnlwjjmq\n"
			+ "4-9 x: rzfrxzcxvxxx\n"
			+ "3-4 g: hgfgg\n"
			+ "2-3 n: nnnn\n"
			+ "11-14 j: jjjjjjjjjjjjjj\n"
			+ "9-10 m: mmmmmmmmmm\n"
			+ "7-8 m: mmmmzmkmjhhwzmmwp\n"
			+ "2-5 r: rrzrr\n"
			+ "3-4 w: vnwpww\n"
			+ "5-9 h: hzhhhhhjgmswvbxfr\n"
			+ "6-10 h: cvhhhlhhhz\n"
			+ "4-5 g: xxgggzg\n"
			+ "1-2 d: dddcf\n"
			+ "5-8 v: vvvvvvvpxv\n"
			+ "7-9 b: bbkbjbpsbbbbtkblmr\n"
			+ "6-8 f: fffffmfgfff\n"
			+ "2-8 f: zfskzfjjwfjsf\n"
			+ "4-5 v: lvdvdvv\n"
			+ "4-5 p: ppbkrjp\n"
			+ "6-14 z: zzzzzrzzzzzzzhzzw\n"
			+ "5-7 g: cbbfngwggzs\n"
			+ "2-4 n: nfpnnhnkpgmjdgc\n"
			+ "11-14 h: hhhqchbhhhwhhhqjjhhn\n"
			+ "5-7 q: qqqqqqq\n"
			+ "2-3 s: sssjs\n"
			+ "11-17 w: wwwxwwwwwwhwwwwwrwww\n"
			+ "12-13 n: nnhtsnxqndxnlnnn\n"
			+ "8-10 j: jjjjjjjhjj\n"
			+ "15-16 z: zzzzzzzzzzzzzzzg\n"
			+ "2-5 j: jfjpk\n"
			+ "1-10 z: mzfzzzzzzpzzz\n"
			+ "13-15 v: vcvvrvdvvvvvvvvvvv\n"
			+ "11-12 j: jljjljqjvjmhjjj\n"
			+ "1-7 c: cctccvv\n"
			+ "6-17 s: slqssbsswsssszswsss\n"
			+ "16-17 s: klksgsgtpsnrpslzs\n"
			+ "12-13 m: mmmmmmmmmxmmfm\n"
			+ "18-20 v: vvvvvvrvvvvvvvvvvlvs\n"
			+ "18-19 d: ddddddddddddddddddv\n"
			+ "4-5 p: srsjp\n"
			+ "2-5 d: czvdk\n"
			+ "5-11 w: pwgbslprbkk\n"
			+ "15-16 b: bbbbbbbbbbjbbbbqnb\n"
			+ "7-8 h: hhhhhwxt\n"
			+ "11-12 g: ggggggggtqggg\n"
			+ "10-11 m: mmmmmmmmmfk\n"
			+ "4-6 m: qvlmmbmmmdrmpcqmmfq\n"
			+ "1-10 r: xrrrrdrrrnrvzrrrrmrr\n"
			+ "5-9 p: pljpvppkgc\n"
			+ "13-14 j: jjjjjjjqjjjjwv\n"
			+ "6-8 g: gggggggqg\n"
			+ "2-7 b: bbkkdwb\n"
			+ "3-16 q: fqqqqlqqqqqqqqqhqqqh\n"
			+ "3-5 x: xfjxv\n"
			+ "1-2 h: hhtkkpvhk\n"
			+ "1-13 d: dddddddddddddddddd\n"
			+ "7-8 x: kxxvngmqxcrqsxxlx\n"
			+ "1-4 m: zvmr\n"
			+ "1-11 n: wnfnnnsnftrnnfn\n"
			+ "6-13 h: gcrjcphhhhpgh\n"
			+ "1-4 h: jghv\n"
			+ "7-10 m: mvtqpjmvvmvgp\n"
			+ "4-7 j: pjjhjjjj\n"
			+ "4-5 c: ccmcc\n"
			+ "1-3 d: ddddd\n"
			+ "2-4 g: gdglgwn\n"
			+ "3-8 z: mbzznvds\n"
			+ "3-11 k: fkjttkdkkqbkkkkr\n"
			+ "5-10 n: nnnnwvnnncnnnnn\n"
			+ "1-5 p: wdnxzn\n"
			+ "2-4 h: phhhhhth\n"
			+ "10-12 p: ppwpwkpgppvppppr\n"
			+ "2-6 r: cdrxrrfrrztbq\n"
			+ "6-15 g: gpjggfgcglqgfggw\n"
			+ "3-4 q: qfqgq\n"
			+ "2-6 m: mmmmmf\n"
			+ "10-11 f: fffffffffff\n"
			+ "5-12 g: bvggjfggkggggrqn\n"
			+ "5-16 q: qbqjqqqxzqqqnqmhqq\n"
			+ "3-5 g: gggggg\n"
			+ "3-6 w: wzpxfbkkwtfdswwq\n"
			+ "6-7 x: xccxxrwfp\n"
			+ "12-13 q: qqqqqqqqqqqqq\n"
			+ "7-12 k: kpkkkktkkkkf\n"
			+ "5-7 f: kjlffrf\n"
			+ "9-12 b: rnlzpmxcbbbbbzb\n"
			+ "7-16 t: tztqtdvrrtgtzjtbtpt\n"
			+ "14-15 g: ghkblgpbgbrtdgg\n"
			+ "6-10 h: hdtqhhhhmlhh\n"
			+ "6-13 g: gggggzgggwggl\n"
			+ "7-9 v: kvtqvdsvvvwvpvgkhfl\n"
			+ "10-12 b: bbbbbbbbbmbtbbbb\n"
			+ "11-18 d: ddbddldhgzpkdcdddwd\n"
			+ "12-13 k: kkklkkkkkkkkkk\n"
			+ "3-4 v: rdvztvgv\n"
			+ "4-9 n: zzjtntjcdlt\n"
			+ "11-14 r: rrrrgrrrrbrrrrrrrrr\n"
			+ "1-4 q: qkvq\n"
			+ "2-9 z: wgpmpmxdz\n"
			+ "13-19 p: pmpqjpppppppjpppppkp\n"
			+ "3-4 s: smxwrsmt\n"
			+ "1-5 m: mmsmhmm\n"
			+ "11-14 p: pptmpppnpppspp\n"
			+ "11-12 c: crcccpccfpcncccc\n"
			+ "17-18 x: xnqxxxxxxxxxxxxxxxxx\n"
			+ "1-2 v: cppsvk\n"
			+ "4-6 p: gnpppg\n"
			+ "2-9 r: krbjwprvrrsmrbrjcfl\n"
			+ "2-12 x: cnqxhvppvzkxc\n"
			+ "1-4 g: bgggg\n"
			+ "3-4 j: jjjj\n"
			+ "4-6 l: lwnlljgsdtl\n"
			+ "1-8 v: vvfhxlcq\n"
			+ "11-17 s: wsssmjsjbfstglsss\n"
			+ "6-10 p: pprkpdpsgvm\n"
			+ "13-15 r: rrqrrrrrrrrrrrrr\n"
			+ "3-4 v: vvvj\n"
			+ "1-10 k: kxprmfhcqkcknpqqggt\n"
			+ "9-10 k: lrkkkkkkxtk\n"
			+ "2-14 r: rrdtrmxjwrxgrv\n"
			+ "8-12 q: qqqqqqqwqqqqq\n"
			+ "4-7 v: vvddhcs\n"
			+ "3-4 h: ghhzsvfkghshhz\n"
			+ "9-12 z: zzwctlnpzlzzzbhz\n"
			+ "14-16 w: wwwwwwwwwwwwwlwlwwww\n"
			+ "11-16 r: frrrrrrrrgrnfrrcdr\n"
			+ "2-3 l: jrlkln\n"
			+ "11-12 w: dhwpwzdpwzkf\n"
			+ "8-12 h: shpthhjhlhhhsd\n"
			+ "4-5 n: nnnnnnnnnnnnn\n"
			+ "5-9 d: dddtqdddm\n"
			+ "2-8 p: kpkhwtptjl\n"
			+ "1-9 k: rhvfjdgmjfckqnbjkxk\n"
			+ "8-12 s: srsfbqgqcjgstkldlzbj\n"
			+ "10-11 x: xkmxbndwvxx\n"
			+ "10-19 k: zksnmwtkdkzkkxnvkjk\n"
			+ "4-5 f: qjnfpsfqqfgmf\n"
			+ "1-9 f: fvfffprxffffsphpfff\n"
			+ "2-9 j: njgjjjbqjnmjxbhj\n"
			+ "2-5 z: zzzxzbfp\n"
			+ "8-15 f: ffffdqflmfffffrfw\n"
			+ "5-15 c: cxmltcccmcmgvjg\n"
			+ "2-3 p: pzqp\n"
			+ "2-8 d: fttcqdzdq\n"
			+ "6-10 p: sgphkqkspxbpfsjd\n"
			+ "5-6 p: pppppf\n"
			+ "5-15 r: rrrgrrrrsrcrrrnr\n"
			+ "11-12 t: ttttttttttlt\n"
			+ "10-11 w: wwwwwwwhxtwwww\n"
			+ "9-10 h: wklhbssjkr\n"
			+ "9-14 j: rjjgjjjfhjjpnbjjjj\n"
			+ "2-3 d: dddd\n"
			+ "6-14 q: qqqqqkqmqqqqqqq\n"
			+ "14-15 w: wwwwwwwwwwlwwxw\n"
			+ "5-9 s: vzssssssn\n"
			+ "13-14 n: nnnnnnnnnnnnxt\n"
			+ "1-9 w: cpwtwvngszwwzpwwcw\n"
			+ "1-2 n: nnnnnn\n"
			+ "7-18 b: bbbbbwbbbbbbbbbbrbb\n"
			+ "4-7 f: pfgfwhw\n"
			+ "7-13 q: qqqqqqsqqqqqhqqqq\n"
			+ "3-10 n: gnpjzgndrntnb\n"
			+ "9-13 q: qlqqqqqqqqrrqpqh\n"
			+ "16-19 m: mrqcmmpmmmmmmmmcqmfm\n"
			+ "5-11 p: fgkdvbqwpsfbpjpprgp\n"
			+ "7-11 q: fqqwdqfkqqqrssqqtp\n"
			+ "5-6 t: trtfkvg\n"
			+ "17-18 h: hhhhhhhhhhhhhhhhhh\n"
			+ "6-18 l: lllllklllllllllllbll\n"
			+ "4-9 q: hqqxqqqql\n"
			+ "1-5 j: jjjjnjjjj\n"
			+ "3-4 g: jxggg\n"
			+ "14-16 j: zljnjjsjjjjjjjjjfjjj\n"
			+ "7-9 m: pmzmmzjmxpcbrqnmmmm\n"
			+ "3-7 z: zlczjzlnrtkfss\n"
			+ "2-15 s: xzswpvgnwwjkzws\n"
			+ "15-16 z: zkzzzzzztzqzzzwzzzz\n"
			+ "6-12 f: fcffffffpfffhx\n"
			+ "9-14 p: kptdgpcvplhjhnppst\n"
			+ "9-11 h: hhhhhhhhhhmhx\n"
			+ "2-3 c: cccc\n"
			+ "8-18 s: sszslksjsrsssssssws\n"
			+ "1-6 h: rgvjlphbbhhhnkzz\n"
			+ "2-7 r: rlzrhrrrk\n"
			+ "17-19 h: hhhhhhhhhhhhhhhhhhhh\n"
			+ "2-4 j: wjzjqj\n"
			+ "5-6 b: bbbvdx\n"
			+ "7-13 k: ztqlwthlsdkrdww\n"
			+ "1-2 m: tmmm\n"
			+ "16-19 d: ddcddddddjdjdddpddd\n"
			+ "2-3 n: tvxj\n"
			+ "13-14 z: zzzzzzzzzzzzpz\n"
			+ "6-7 x: xxxxxxl\n"
			+ "2-3 q: qnrw\n"
			+ "7-10 l: ljlvfhgrmllkhlxlq\n"
			+ "2-4 b: bbbq\n"
			+ "16-17 h: hshhhhhhhmhhhhhckh\n"
			+ "1-6 r: rrkrrr\n"
			+ "14-16 n: nnnnnnnnnnnnnnqnnn\n"
			+ "5-11 h: fhhlhhhhhhjktdhngj\n"
			+ "3-4 g: gzgdvgqgq\n"
			+ "2-4 r: hvrg\n"
			+ "7-11 b: bbgcbbbqbwsbgbbbk\n"
			+ "5-9 m: hfpmxpmvmb\n"
			+ "17-20 v: vvvtvtvvvvvvvvvvqvvb\n"
			+ "1-20 z: pszbttwrmqvlrgkmmlwz\n"
			+ "9-16 h: hhhhhhhhhhhhhbhth\n"
			+ "1-2 n: nhnhh\n"
			+ "1-10 n: wnnnnnnfnrnn\n"
			+ "1-5 k: sjkkk\n"
			+ "1-7 k: lklkkkpkk\n"
			+ "4-6 n: nnnznwn\n"
			+ "14-15 s: sssssssssssssds\n"
			+ "9-14 z: zzzzjzbzzzzzzzz\n"
			+ "16-19 g: ggggfrgzgggggggnggg\n"
			+ "9-13 v: vphvvvvvvjvvvmvv\n"
			+ "2-3 l: lvvxpvvqzhdzrk\n"
			+ "4-7 c: qdhclzccwcbmvcsz\n"
			+ "5-8 s: stsskssws\n"
			+ "3-4 c: kbxp\n"
			+ "2-10 b: dtlqbbsvzbbklbgbf\n"
			+ "8-10 s: smsslsbrsbcvsjsts\n"
			+ "2-4 k: kkkkl\n"
			+ "15-16 x: xxzxfxxrdxxfxpxrxn\n"
			+ "11-18 h: hhnrdhhhhhhhhhhhjxh\n"
			+ "1-2 n: plzvhknwjn\n"
			+ "4-9 w: wwzkwwwwxww\n"
			+ "2-3 l: lllp\n"
			+ "3-9 j: fkzjnhqzpjjd\n"
			+ "4-6 k: skkltk\n"
			+ "3-4 k: klvkkkk\n"
			+ "3-4 k: kkkg\n"
			+ "10-11 d: bqdkzpxnfdd\n"
			+ "12-14 r: rqrrrrrrrrrlfxrr\n"
			+ "2-3 r: znrf\n"
			+ "1-4 j: hgzjjtnw\n"
			+ "1-6 w: mwwtwwww\n"
			+ "14-16 d: spddddtddzjsbdcx\n"
			+ "3-4 x: xxbf\n"
			+ "11-12 r: vrrrkdrsrnhrnrvrr\n"
			+ "1-4 c: clmw\n"
			+ "3-8 t: ztvndgtx\n"
			+ "7-10 z: zzzzzzzzzzzzzv\n"
			+ "4-12 t: tbrthtwtchtt\n"
			+ "1-7 h: hwhqrvhqhfh\n"
			+ "4-7 s: ssfssss\n"
			+ "5-13 s: kjtsspjmzrfxp\n"
			+ "4-7 z: zzzzzzzz\n"
			+ "5-15 h: gvhhrscmwmdhhhghhn\n"
			+ "7-8 r: rrrrrrns\n"
			+ "6-9 r: zrrrrrddr\n"
			+ "7-15 v: vvghgtjwwvzwhrk\n"
			+ "14-17 c: cccccsccccccnbtchc\n"
			+ "2-3 k: kgrgr\n"
			+ "15-17 k: kkkkkkkkkkkkkkvkk\n"
			+ "10-11 f: fffffffffvj\n"
			+ "6-8 r: prdnmrrzg\n"
			+ "3-4 f: kcfx\n"
			+ "4-5 k: kkkkkz\n"
			+ "4-15 t: ztttttqhcpstwtt\n"
			+ "1-6 g: cvgghtg\n"
			+ "9-15 j: jtrxvjtjhjjjsjj\n"
			+ "9-10 f: fffcffffff\n"
			+ "10-11 r: hjflczjkqrq\n"
			+ "3-8 k: jssmkkkbpkkjsvnhwkh\n"
			+ "6-10 g: ngggkggmbggtcgg\n"
			+ "15-16 x: xxxxxxxxxxxcxxjx\n"
			+ "8-9 k: kkkkkkkkn\n"
			+ "7-8 b: rbbbbbxdbb\n"
			+ "2-5 w: wwwdwmkhvd\n"
			+ "1-6 v: hfpwkxgvv\n"
			+ "12-14 z: zzzzzzzzzzzjzz\n"
			+ "14-16 s: ssrsmssssssssssss\n"
			+ "3-6 z: zdmzjkc\n"
			+ "2-4 m: mmbb\n"
			+ "13-18 w: lwwwwwkrwwwwwwwwwksw\n"
			+ "5-6 r: bwjrjgrrrrjbg\n"
			+ "5-9 r: rrxmrrlrrj\n"
			+ "2-4 g: gggk\n"
			+ "5-10 s: ssssgmssrscptfrc\n"
			+ "6-8 q: qqqqqzqqq\n"
			+ "16-17 m: kmmmmmqmxmlpsmmmm\n"
			+ "7-10 t: thxvtttztttjttvtkrcc\n"
			+ "2-4 p: pppp\n"
			+ "4-8 q: njdqbqqqrxd\n"
			+ "2-5 w: gwmwklnkfmwjjggw\n"
			+ "10-16 m: mmmmmmmmmzkmmmmw\n"
			+ "1-2 w: btkxj\n"
			+ "1-3 z: pzphlh\n"
			+ "7-10 j: jjjjrpcpjgjjkz\n"
			+ "3-5 j: jjljjj\n"
			+ "1-5 l: lkzflppcgpll\n"
			+ "4-6 m: mmmmmrm\n"
			+ "2-4 m: vmzmmmdhcmntntlrgqk\n"
			+ "8-9 x: xxwxxxlbxxx\n"
			+ "1-2 s: rwrbhvt\n"
			+ "1-5 d: dfdhdd\n"
			+ "6-7 z: zzzzzfz\n"
			+ "12-14 v: vvvdlvqvvnvkkm\n"
			+ "2-7 s: skftlhmfdgpsp\n"
			+ "9-11 q: rlqcqvqqqqqqqqq\n"
			+ "5-6 g: ggmgwtg\n"
			+ "5-7 m: mmmmmmmmmmmmmm\n"
			+ "4-12 f: qffmdmffzfdff\n"
			+ "8-10 k: lkwlkvkkkkkkkkkqk\n"
			+ "15-17 p: qppppqppppppppzpv\n"
			+ "3-4 x: xxxxx\n"
			+ "7-8 x: xxqxdxxxxx\n"
			+ "6-10 b: bbbbmsnkfbdrbnbtlnvb\n"
			+ "3-16 d: ddmdddddrddddddp\n"
			+ "8-11 n: nnnnnnnmnjdd\n"
			+ "3-4 v: vvgd\n"
			+ "11-13 n: nnnnnnnnnnfnn\n"
			+ "5-10 n: nnnnpjnngcnqnn\n"
			+ "7-11 w: wtwbbtzswqt\n"
			+ "1-6 f: fffffwfff\n"
			+ "8-10 q: qqvqqqqqqq\n"
			+ "2-3 h: hhhh\n"
			+ "17-18 m: mmmmmmmmmmmmmmmmqmmm\n"
			+ "10-11 f: ffffffffffdff\n"
			+ "2-4 z: zzzz\n"
			+ "5-6 g: gggghz\n"
			+ "6-19 n: nnnnnqnnnnnxnvnknnnn\n"
			+ "2-6 h: rhhdbk\n"
			+ "2-5 w: fnkwgww\n"
			+ "4-5 c: cqcdgtmcccrbcckng\n"
			+ "1-12 h: hkwptjwxmmgfhbvgj\n"
			+ "4-5 g: pbhtb\n"
			+ "1-11 h: hhhhhhhhhhhhh\n"
			+ "5-11 v: gfrfvfqmgsnrtqkvq\n"
			+ "13-14 s: sstssssscssdssss\n"
			+ "3-8 b: tzjqgnkbbzzvrsb\n"
			+ "8-9 b: bbbbbbbvb\n"
			+ "7-13 r: rrhdcvrrtxmrzrmfxr\n"
			+ "3-6 s: lsshsk\n"
			+ "2-6 g: rqzpqtxmbggsgg\n"
			+ "4-5 b: lbbffb\n"
			+ "3-4 m: kmpm\n"
			+ "8-18 w: wwwwhwwhwwwwmwwpbdw\n"
			+ "6-7 n: nnnnnjn\n"
			+ "6-9 r: ggrrsqrrrqrhbmrqzgd\n"
			+ "7-9 g: rggggggzc\n"
			+ "1-8 n: nnltwnnwn\n"
			+ "6-8 r: rrrrrpxvr\n"
			+ "4-12 c: ccccccccccchcccc\n"
			+ "1-3 g: mrbgf\n"
			+ "6-12 p: zfpsppknppvpmlrspbn\n"
			+ "1-4 g: jxmmns\n"
			+ "1-11 q: zdzhtqsxkcrklwk\n"
			+ "2-4 x: svqmxxl\n"
			+ "7-8 l: lllrwllll\n"
			+ "9-18 v: zkhlxtqvvcvndkzkvvt\n"
			+ "2-9 f: fksffshzx\n"
			+ "2-5 j: jkjnj\n"
			+ "4-15 j: qjjjmvjjpvmjjjbj\n"
			+ "1-5 p: kpppx\n"
			+ "1-6 v: vjttbvffvdhvk\n"
			+ "4-17 l: wlsqvxkrjlltlnxnmds\n"
			+ "1-3 p: pdzqnp\n"
			+ "1-3 h: hhhh\n"
			+ "2-14 z: mmvzzvzzkzhzszvqzzf\n"
			+ "3-6 q: qqrjsxqqq\n"
			+ "3-5 h: hrhvr\n"
			+ "1-8 k: kkskktnkklzdkjgk\n"
			+ "17-18 p: ppppvpppqppppmpppxpp\n"
			+ "2-8 f: fffjsfbp\n"
			+ "9-10 v: vvvfvvvtvxltsvv\n"
			+ "6-12 j: jpvptjqpkjwjr\n"
			+ "15-16 v: vvvvvvvvvvvvvvvp\n"
			+ "6-8 q: qqpqbqqvqq\n"
			+ "10-12 n: nnnnnnnnnnnjn\n"
			+ "13-14 n: nnnnnnwnnnnnxgnn\n"
			+ "2-3 k: kkkxl\n"
			+ "2-3 w: ldmm\n"
			+ "14-19 m: fphmmmmmmkmmmbmdmmw\n"
			+ "4-7 w: wwwgjwww\n"
			+ "8-9 d: dddwdddddd\n"
			+ "6-7 w: wwwfwfvtw\n"
			+ "2-6 j: hlcpkj\n"
			+ "1-3 m: xsmmc\n"
			+ "1-9 b: bbbbbbbbbbb\n"
			+ "1-4 z: zsgz\n"
			+ "2-12 v: vpvvvvvvvvvmvv\n"
			+ "2-16 c: vccjrtcckcccckcsc\n"
			+ "4-15 d: cqxpptqpwmqbvsvvt\n"
			+ "2-14 q: qqqfqwpqzqsmqqvqrxjr\n"
			+ "9-10 w: wvkfhfkhwjvw\n"
			+ "6-10 q: tqqmqktxqfvq\n"
			+ "4-11 f: kvqlfqxfrsf\n"
			+ "7-14 m: rmxmmmmmmmmmmmmxmm\n"
			+ "18-19 v: vvvvvvvsvvvvvvvvvvvv\n"
			+ "7-8 x: fxnxxjjx\n"
			+ "5-6 d: dzddrd\n"
			+ "9-11 b: bbbbbrbssqtbb\n"
			+ "14-16 x: sxxxlxxxxxsxxxxxxxx\n"
			+ "5-9 t: wtttttbptttttqttmtt\n"
			+ "11-13 l: lllllflllwsll\n"
			+ "7-8 r: rrrmprjcv\n"
			+ "6-9 p: plvpdzzppptpkpkpgp\n"
			+ "2-13 g: chmjgvkvsplztzvtlzl\n"
			+ "6-8 z: czzzzjzkg\n"
			+ "1-5 l: jlltpfwlrl\n"
			+ "6-7 d: jddcggqmdddd\n"
			+ "3-5 c: cxbbc\n"
			+ "13-14 p: ppqpppppppppbs\n"
			+ "3-7 w: rwwnqlw\n"
			+ "4-5 v: vvvvv\n"
			+ "9-10 v: vvvvvvvvvm\n"
			+ "3-5 z: zmxzlz\n"
			+ "7-8 c: cccccchdc\n"
			+ "2-4 d: drddctmgd\n"
			+ "3-4 n: nnnn\n"
			+ "3-10 q: cbqszqfqqqbvrrtsfq\n"
			+ "4-17 p: pppkppppppppppppwp\n"
			+ "11-12 n: nnnnnnnnnnnn\n"
			+ "14-15 d: dddddddddddddxn\n"
			+ "6-11 k: gbmbzkcmzskpkhp\n"
			+ "2-10 z: zrzzzzzzzjzzz\n"
			+ "1-2 q: wvqq\n"
			+ "11-14 d: ddddddddddhddn\n"
			+ "2-7 h: hhhhhhhhxh\n"
			+ "10-19 m: mmkmmmmdmmmmmqhvpldm\n"
			+ "2-10 j: jbmjjjrcjj\n"
			+ "7-9 c: ccccplccccc\n"
			+ "7-19 c: cckcbwlcccccccccczp\n"
			+ "9-13 z: zzzzzzjmzzzzp\n"
			+ "16-20 j: vjkjjcjjrjjmtnbjjjnj";
	
	public static boolean testPolicy(String pPolicy, String pPassword) {
		System.out.print("testing old " + pPolicy + " for " + pPassword + "...");
		String policy[] = pPolicy.split(" ");
		String q[] = policy[0].split("-");

		String regex = "[" + policy[1] + "]{" + q[0] + "," + q[1] + "}?";
		if (pPassword.replaceAll("[^" + policy[1] + "]", "").matches(regex)) {
			System.out.println("ok");
			return true;
		}
		System.out.println("not ok");
		return false;
	}
	
	public static boolean testNewPolicy(String pPolicy, String pPassword) {
		System.out.print("testing new " + pPolicy + " for " + pPassword + "...");
		String policy[] = pPolicy.split(" ");
		String q[] = policy[0].split("-");

		if (pPassword.charAt(Integer.valueOf(q[0]) - 1) == policy[1].charAt(0) ^ 
				pPassword.charAt(Integer.valueOf(q[1]) - 1) == policy[1].charAt(0)) { 
			System.out.println("ok");
			return true;
		}
		System.out.println("not ok");
		return false;
	}
	
	public static void main(String[] args) {
		int count = 0;
		int newCount = 0;
		for (String line : INPUT.split("\n")) {
			String l[] = line.split(": ");
			if (testPolicy(l[0], l[1])) {
				count++;
			}
			if (testNewPolicy(l[0], l[1])) {
				newCount++;
			}
		}
		System.out.println("" + count + " valid passwords were found.");
		System.out.println("" + newCount + " valid passwords were found (new policy).");
	}

}
