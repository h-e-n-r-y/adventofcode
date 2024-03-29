package de.henry.adventofcode.y2020;

/**
 * Solves the "Valid-Passwords"-Riddle of December 2nd 2020. 
 * https://adventofcode.com/2020.
 * 
 * @author henry
 *
 */
public class DayTwo {
	
	private static final String INPUT = "1-4 m: mrfmmbjxr\n" +
			"5-16 b: bbbbhbbbbpbxbbbcb\n" +
			"7-8 x: qxrxmxccxxx\n" +
			"9-11 k: kkkkkkktmkhk\n" +
			"8-12 g: sgwvdxzhkvndv\n" +
			"6-9 v: zvmvvmvvvd\n" +
			"8-19 f: ffffsplmfflffhtfrfj\n" +
			"5-16 p: pppppppppspppjpcp\n" +
			"2-3 w: wwmw\n" +
			"7-19 j: jjjjjjjjjjjjjjjjjjvj\n" +
			"5-9 q: wqzqqqqqq\n" +
			"14-15 g: gggggggggglggfgg\n" +
			"4-6 p: tppzkppdt\n" +
			"11-14 p: vppgpktpppppptpppqp\n" +
			"5-9 f: bfflffrfgf\n" +
			"7-9 p: ppppptbzn\n" +
			"1-3 l: lllvn\n" +
			"2-4 g: qvcdg\n" +
			"1-3 m: wsmdv\n" +
			"1-5 v: vvvvvvvv\n" +
			"10-14 l: lckqlgjllltlwbl\n" +
			"3-4 t: bsttftltjhbqbgtm\n" +
			"15-17 j: jjzjjjjjhjjjjjjpzjj\n" +
			"2-3 t: thtt\n" +
			"6-17 f: ffwkwzjtjktvsfmfhvsf\n" +
			"3-5 b: rqxbb\n" +
			"4-7 m: nbcmcwmmxrxqvtjfmm\n" +
			"1-2 v: gzvvvv\n" +
			"1-3 w: hkwhv\n" +
			"7-8 p: pppppppp\n" +
			"3-4 h: hhnwh\n" +
			"2-4 t: ttrtjtththkr\n" +
			"3-4 w: wwww\n" +
			"4-6 s: xsntgrftmpx\n" +
			"4-7 s: ssskssmsbs\n" +
			"10-15 m: bmmrbmmmmlmmmmmm\n" +
			"12-13 w: wqpwdmwllnjwx\n" +
			"5-14 n: nnnnlnnnnnnnnmnn\n" +
			"5-6 k: kktkfczk\n" +
			"5-7 r: nrdrtrvr\n" +
			"4-6 c: ccqchcc\n" +
			"2-9 l: fnldtfnbxjlvnlsnjhml\n" +
			"1-13 d: dlchvkccnwrcc\n" +
			"5-7 j: jjjjjjj\n" +
			"3-5 z: zzzzz\n" +
			"6-12 f: ffffflvmfhfx\n" +
			"8-10 w: wwwwwwwwww\n" +
			"3-4 r: rrbtr\n" +
			"3-11 b: bbbrbbvphbxbqk\n" +
			"16-17 n: nqhknnnnsnnnnnnnnnb\n" +
			"18-20 k: kkkkkkkkkkkkkkkkkhtj\n" +
			"3-15 r: ktvzqbmbrvczprfcw\n" +
			"9-11 q: qnqqdqqqgrrqsqq\n" +
			"3-5 p: pvppp\n" +
			"7-11 m: mfcdmmxmmmp\n" +
			"7-8 t: ttttktnt\n" +
			"5-6 b: bbpbbbv\n" +
			"14-16 z: zzzzzzzzzrzzblzw\n" +
			"11-12 j: jkjjjkjjjjjjgj\n" +
			"7-9 q: qqqqqqqqqq\n" +
			"10-11 f: cfffffffffff\n" +
			"4-6 c: nccccc\n" +
			"7-8 r: gmdlqfpwmrr\n" +
			"6-8 v: nvvpdnjx\n" +
			"8-12 x: xxlxxbbxxxxx\n" +
			"8-10 s: ssxssssssss\n" +
			"5-12 z: zhzdfzgdzzhzlz\n" +
			"11-12 k: qbkhvqjpqzfq\n" +
			"2-11 w: wwmlttwjflwdjcpclww\n" +
			"2-16 w: twkkmcrxmvjtwxlwsksf\n" +
			"6-8 s: sssfxbskvs\n" +
			"5-6 s: ssnsxsbs\n" +
			"10-19 l: ndzmdxqlnllxsbbwvsl\n" +
			"2-4 g: gggg\n" +
			"5-10 x: zxxxsxxxxxxxsxx\n" +
			"7-15 f: ffbrbdtzvdffktxfm\n" +
			"7-8 m: xmkmmmmmtmm\n" +
			"9-13 s: hksrdhzlsdmps\n" +
			"15-17 b: bbbbbbbrbbbbbbbrbb\n" +
			"3-5 x: xxxxxxx\n" +
			"2-6 t: wtltztnct\n" +
			"3-15 v: vvwvvvvvhvvvbwwvmdvr\n" +
			"12-14 p: ppphsppppppbphp\n" +
			"8-9 t: ttttvttttttt\n" +
			"2-3 c: cchvj\n" +
			"8-9 z: vzzzzzzgl\n" +
			"11-12 q: qqmqqqqqqqsnqqqqqqq\n" +
			"12-13 d: dddddddddddmd\n" +
			"8-9 t: wttttttqt\n" +
			"7-8 p: ppppvvcw\n" +
			"4-5 g: gncgj\n" +
			"12-13 s: sssssssssssmw\n" +
			"7-9 f: pswpnjftf\n" +
			"11-16 p: ppppnpkpkzppcpzbppp\n" +
			"1-12 q: ksqrqpqnqmqxqb\n" +
			"2-10 l: lllllllllll\n" +
			"17-18 z: zzzzzzzzzzzxzzzzzz\n" +
			"11-12 g: qggbjgggggssgggrk\n" +
			"3-4 s: bpss\n" +
			"6-8 v: vwvvvrvvv\n" +
			"3-4 t: tglktt\n" +
			"4-12 l: kvrnzqslwrdkfll\n" +
			"12-16 b: fbbbbbnbbvbbbbbcbbb\n" +
			"5-6 t: ttttzz\n" +
			"5-8 w: sqwhwwxw\n" +
			"8-9 z: zzzvztzrzzzz\n" +
			"3-6 l: llvdlt\n" +
			"7-8 r: mrcvnrrr\n" +
			"10-11 k: kkkkkkkkkmc\n" +
			"1-3 n: nnnmn\n" +
			"4-16 c: dqlcbclcrxkkszvcv\n" +
			"9-10 g: fxssmlmgbh\n" +
			"5-6 p: nwpfpp\n" +
			"3-7 w: cwhgrfshdwhwwll\n" +
			"14-16 l: llllllllllllllpll\n" +
			"3-4 f: ffff\n" +
			"4-9 d: dcdddxzvmrd\n" +
			"4-11 w: jwwnwwwwwvx\n" +
			"3-4 t: ttvc\n" +
			"4-17 r: rrsrrrrrrrrrbtrrrr\n" +
			"8-9 x: wqxxxcfdx\n" +
			"6-8 d: qgddwddtdddlc\n" +
			"12-13 v: vvjvvvvvzvvtvv\n" +
			"3-4 g: sghxg\n" +
			"3-4 b: ckbbmprfbbmzgqtkbw\n" +
			"5-6 x: xxxxxv\n" +
			"10-13 f: zpfffbfchxfffffjff\n" +
			"5-6 f: ffffwf\n" +
			"12-19 l: mlllllplllldllnsllql\n" +
			"4-5 v: vvvvp\n" +
			"5-8 w: vjwvghggwww\n" +
			"1-3 n: lnnn\n" +
			"16-18 p: ppppppvpppppwppppppp\n" +
			"15-18 z: zzzzzzzzzzzzzzjzzg\n" +
			"4-6 b: bbmbbb\n" +
			"5-7 z: wzlwzmzzzzzzzzzzzwz\n" +
			"8-12 p: gppmpppvppkzpcnpb\n" +
			"16-19 h: hhbhhhhhhhhhhhlnhhw\n" +
			"2-3 n: nnnn\n" +
			"3-10 m: mmntfkdjftmtmmbm\n" +
			"3-5 j: jjjjw\n" +
			"4-6 z: zjnzzzdzz\n" +
			"1-7 s: zsvsssf\n" +
			"6-7 v: vtvvvcg\n" +
			"3-12 f: qsrtmnxkvlcmt\n" +
			"5-11 q: mqgqqqqqrpch\n" +
			"5-9 g: msxkggnggg\n" +
			"3-8 v: vvvvhvjvdvxtr\n" +
			"4-6 k: jcklxdhkwhsqhq\n" +
			"6-7 x: vppxbhcjzxdqx\n" +
			"2-3 n: ntrg\n" +
			"7-8 g: gggwgjdhg\n" +
			"1-3 d: dddd\n" +
			"14-18 l: llllllllwlllxllllllz\n" +
			"8-19 g: ggggghggkhgrtzcgrrk\n" +
			"7-14 q: phzxvmbxxfsfwr\n" +
			"8-14 r: hbjmdrhnpxnwgz\n" +
			"15-17 d: dddddpddddldddtdgddd\n" +
			"6-7 k: kkkkkgkkq\n" +
			"2-12 w: wwzwwwwwwwwww\n" +
			"5-8 q: qqqqqqqzqqwqqzqcq\n" +
			"5-6 z: czzzrz\n" +
			"14-15 b: bbbrzhbbbbnxbgbb\n" +
			"12-13 d: dgddddddddtvddddvbz\n" +
			"3-5 v: vvvvv\n" +
			"13-16 q: qqqqqvzwqqqqqqqq\n" +
			"2-3 n: jpznnwfpchs\n" +
			"7-10 w: jwwpwkwwwpw\n" +
			"6-7 b: bbcnbcjxbbb\n" +
			"14-17 w: wqtwwwwwnwcwwbsww\n" +
			"3-14 w: gwwwwwwwhwwnxwwwww\n" +
			"4-9 w: mwllcfjfwwwjp\n" +
			"9-12 n: nnnnnnnhnwjnn\n" +
			"2-4 j: jjjjj\n" +
			"3-6 t: mrmttccttqt\n" +
			"16-17 p: ppmjpgptzgbppphfbp\n" +
			"12-17 v: vvvvvvvvvvvvvfvvvv\n" +
			"13-15 x: xxxxxxxxxxxxxxgx\n" +
			"2-4 d: dddddddd\n" +
			"2-5 t: ttmvt\n" +
			"13-14 j: jjjjjjjjjjjjtj\n" +
			"3-5 r: ggmrdf\n" +
			"7-8 f: ffdfflszfsfffqff\n" +
			"10-11 t: ttpttttttrgtt\n" +
			"8-12 j: jjjjqdhzjhjdj\n" +
			"19-20 z: zbzzzzzzzzzzzzzzzzrq\n" +
			"7-11 b: bbbbbhbbbxbbb\n" +
			"4-9 p: gzmkkbtpkzpgthklpq\n" +
			"2-5 b: bbbbxgb\n" +
			"4-13 k: kkkkkkzktckkkwkjkk\n" +
			"10-12 q: vrxznfqqnqgq\n" +
			"15-16 m: mmmmkmmmmmmmmmmmm\n" +
			"15-18 h: hlhhvhchthhhhtphhh\n" +
			"2-3 m: mftzmc\n" +
			"6-11 s: ksssssssssszs\n" +
			"5-6 q: qqqpqkq\n" +
			"7-8 n: nnfnnnnpn\n" +
			"6-8 c: chfcllrvxcnnjhtc\n" +
			"6-8 k: kkkkkxlk\n" +
			"2-4 s: tsspb\n" +
			"9-12 q: qqqqqqqqqqqqqq\n" +
			"17-20 h: hhhhhhhhhhhhhhhhhhhh\n" +
			"6-13 r: rrrrrgrrrrrrn\n" +
			"4-8 f: fffrfffz\n" +
			"13-14 n: nbnnnngnnnnnnpz\n" +
			"8-11 f: fvffsfqftcffff\n" +
			"3-5 w: vwhxz\n" +
			"8-10 x: nmxxknlptx\n" +
			"3-4 p: pppt\n" +
			"17-18 v: vvvvvvhkvvvvvnvvjlvv\n" +
			"10-15 z: twnsdkmgpvzfmzg\n" +
			"3-5 n: njnjnkghp\n" +
			"10-12 q: qvqqqqqqqqqq\n" +
			"6-7 r: rrrrrrrr\n" +
			"3-4 t: qltt\n" +
			"2-16 f: gffflcvtpfkfcjfrjvfs\n" +
			"3-5 s: swssp\n" +
			"11-13 l: lrpllllllvtslwllllld\n" +
			"1-3 n: nnnn\n" +
			"3-5 g: jjggnvg\n" +
			"4-5 b: bvbbb\n" +
			"13-15 l: llvllllllllllnll\n" +
			"5-6 j: hjjjjfsj\n" +
			"3-4 b: bkfbnb\n" +
			"5-8 z: zdzzzzzzzrzzz\n" +
			"3-4 r: rrrx\n" +
			"2-12 c: mczhvchkmjdrjh\n" +
			"12-16 x: sjxbcgdqtpfxflsxx\n" +
			"2-4 c: tcxf\n" +
			"4-5 w: kwjww\n" +
			"1-2 r: rrrwzc\n" +
			"4-7 d: ddddddkdd\n" +
			"5-6 q: qqqqqp\n" +
			"13-16 l: flljlllvnzlllllclldl\n" +
			"3-6 j: jjjpjj\n" +
			"3-4 g: gxgg\n" +
			"10-11 n: nnnnnnnnnnn\n" +
			"2-5 j: ztchj\n" +
			"4-6 j: pjzzrmjvhcxn\n" +
			"4-11 c: jchcccgccckc\n" +
			"11-12 d: dddddddddddd\n" +
			"6-7 n: nznnnnnntnnnnzpjfjnn\n" +
			"8-9 k: kbkkkkkkk\n" +
			"13-18 x: xbxxmxqxxxmxkxsxxxx\n" +
			"7-16 r: rrrrrrzrrrrrrrjmrrr\n" +
			"3-5 h: hhqhd\n" +
			"1-2 b: bbmb\n" +
			"2-3 n: rlnntn\n" +
			"2-8 q: qnfqnqhx\n" +
			"2-5 b: bjbbh\n" +
			"5-11 t: twtjnpttqtvtttptt\n" +
			"16-17 w: wtmwwhxtgwrrswwfblll\n" +
			"8-16 g: ggggghshggdggggcpwg\n" +
			"1-3 l: lsllzl\n" +
			"11-13 n: nnnvncnnmvnqnnnnn\n" +
			"6-7 s: ssqssss\n" +
			"10-18 t: tttnmjxttjttttttdzt\n" +
			"4-10 n: nkvncgtdpz\n" +
			"16-18 p: cphtrgffcpphfspxppgp\n" +
			"2-6 k: kkhgkskkm\n" +
			"6-20 r: fhrwtrzwrddfrndnrlgr\n" +
			"2-8 w: lkwnccgw\n" +
			"6-10 x: lxxxxxxgxwxxxrxqxx\n" +
			"4-9 q: tqtpgqjzdmqfq\n" +
			"9-12 k: kkkkkqbkkckkkjkql\n" +
			"5-9 r: rrrrrrrhcr\n" +
			"17-20 h: hhshshhhhhhhshhhbhhq\n" +
			"7-9 s: dngddfsss\n" +
			"12-13 q: qqqqqqqqqqqcq\n" +
			"2-6 v: vqtvvvv\n" +
			"8-10 c: cccfcncccccc\n" +
			"14-15 m: mmmmmmmmmmmmmmdm\n" +
			"7-14 s: ssslssfdssflvvsj\n" +
			"2-5 z: wcllj\n" +
			"2-11 n: cvnrlftcjct\n" +
			"8-16 k: krzkfbkkqkhnsjkjgkk\n" +
			"2-7 q: mvhvqnzdjw\n" +
			"5-8 l: lgbnlnclkllll\n" +
			"4-12 l: llllmllrlgllrklnlrbt\n" +
			"7-10 j: jjjjjjnjjcjsj\n" +
			"1-2 k: dgwmgsn\n" +
			"2-5 z: zjmxc\n" +
			"6-7 c: ccccccccc\n" +
			"14-17 k: bkkkkkkkkkkkndkkkk\n" +
			"2-4 x: xxjxtxbq\n" +
			"7-9 w: drjcfwzwwwfwwfzxww\n" +
			"4-5 p: pppwc\n" +
			"4-5 r: rrrvm\n" +
			"1-8 r: qrrrmrrrrr\n" +
			"16-18 l: llllllllldllltlklk\n" +
			"1-11 p: pwcpppbppppppp\n" +
			"5-19 w: wwwwwwwwwwwwwwwcwww\n" +
			"17-18 k: kkkkkwkkkkkkkkkkkxk\n" +
			"12-15 f: fsffffffflfqgfx\n" +
			"6-13 d: zddpdvddrvrdxq\n" +
			"1-10 f: ffffffrfkb\n" +
			"13-14 x: xxxxxxxxxxxxxxx\n" +
			"16-20 j: jjjjjjjdwjjfjjjjjjdj\n" +
			"8-11 r: rrrrrrrrrrrr\n" +
			"15-16 x: dxjxxxdxxxxxxxxxwxx\n" +
			"3-9 m: mjhqdgkmzmsmtdmhfn\n" +
			"2-7 k: kkkhwgtxlkmkqkk\n" +
			"11-15 m: mmgmmmmnsjmmlmmm\n" +
			"1-2 v: wvvk\n" +
			"8-14 s: zssssssssssssts\n" +
			"3-4 z: ztbzzr\n" +
			"4-10 x: xxkmqxxxxx\n" +
			"3-5 p: pkppppppppzpp\n" +
			"3-15 q: qpqmkqfqqlqqdfqtkqq\n" +
			"16-17 d: ddddddzbxcdddcddq\n" +
			"4-5 s: nqssf\n" +
			"4-5 s: sssbks\n" +
			"4-5 s: tsjlhsbsmt\n" +
			"1-5 z: zzzbztzf\n" +
			"1-4 l: pvsgtvt\n" +
			"3-6 b: bbbjbb\n" +
			"2-4 d: wkdvd\n" +
			"16-18 w: wwwwwwwrwwwwwwwzwkw\n" +
			"15-17 t: tqttjttttttttvtttt\n" +
			"5-9 q: qcqqqqdtqq\n" +
			"8-11 s: sssssssfssssssssssss\n" +
			"5-6 x: xxxvcpbxr\n" +
			"13-15 d: ddwdtctnjdcdpch\n" +
			"5-6 z: zzzwzzzq\n" +
			"3-7 v: bsphcnvwvtvphdp\n" +
			"3-4 q: vhcprqqgdmlfpwqqw\n" +
			"11-18 b: bfbbbfbbbbvhwbbbzlb\n" +
			"12-15 c: cccccccccccccqfcc\n" +
			"4-10 j: jjjjjjjjjjjw\n" +
			"8-14 s: ssssssspmssssssssms\n" +
			"6-15 b: jxnbdvxbbbcbrsbxrs\n" +
			"10-12 s: ssssjsssssfs\n" +
			"8-12 f: ffffdfkqflfpf\n" +
			"8-9 w: wwwwwwwwz\n" +
			"7-10 z: fzzlzzbtmthzzzz\n" +
			"2-3 k: kqzzb\n" +
			"11-12 s: ssssssssssls\n" +
			"16-17 r: rrrrhrrrrrrrrrrnr\n" +
			"3-11 b: czpbpbzswgcddm\n" +
			"4-8 z: cnzztzgzqz\n" +
			"18-19 m: mjmmmmmmmmmmmmmmmpk\n" +
			"10-13 q: gqqqqqqsxqqqqdtqkq\n" +
			"10-11 x: nxmbxxxrgpmxxxfnxxxz\n" +
			"2-5 x: xbxzrxd\n" +
			"9-14 l: llllpljlllfllwv\n" +
			"1-2 m: mmmmmm\n" +
			"1-3 b: fblbbfbbbbbtbbgbbb\n" +
			"3-4 g: gnnccg\n" +
			"8-9 f: fffffffkffff\n" +
			"5-6 r: rrrrhf\n" +
			"7-8 l: lwlwllllllctl\n" +
			"5-7 j: jrjjwgjvkkncnjbqc\n" +
			"3-4 b: bbsbb\n" +
			"4-13 c: jmcczvkbxccdf\n" +
			"4-5 g: wgrgg\n" +
			"7-8 d: dgddddzh\n" +
			"3-8 h: hhbhhhhhhhh\n" +
			"15-16 l: llldllllllldlllllll\n" +
			"11-15 r: rrgrrrrrrrnrrgxr\n" +
			"10-11 l: lllllllllll\n" +
			"4-5 x: xfdbjsmbbcxdphvlfkxr\n" +
			"9-12 m: rqmnmrmhcmmms\n" +
			"3-8 b: tzsnnndnbwgbskbb\n" +
			"4-10 v: vvkvvdrvwvc\n" +
			"9-11 j: jjjdjjjjjsj\n" +
			"6-11 b: hbbmbbbbbbjbtrbbbz\n" +
			"13-16 v: vvpvvvbvcvvvvvvvv\n" +
			"11-14 j: jjjjjjljjjtjjmj\n" +
			"7-11 v: cvdglnvjxkvvgptxvp\n" +
			"1-6 t: ttjqtttzt\n" +
			"7-10 f: ffwpzfxjfgffzf\n" +
			"4-7 d: dddgddp\n" +
			"4-19 n: mjbdzqxhtfbnbfxrpgnh\n" +
			"6-13 d: ddddddddddddd\n" +
			"2-4 t: rhkd\n" +
			"5-9 c: ccrcxzjdzccx\n" +
			"3-4 j: fwjj\n" +
			"15-19 q: qqqtxqqqqqqqqqqqqqqq\n" +
			"1-11 c: gcccccmccctcc\n" +
			"3-5 d: dxhhdr\n" +
			"8-12 k: pkvrkkkvkkmbkcxjwktk\n" +
			"9-11 p: ppnpppppxppp\n" +
			"11-12 p: dppcsppppppqppp\n" +
			"7-8 b: bbbbbbmbqp\n" +
			"7-8 c: cbccccccc\n" +
			"8-9 b: bbbbbbbcrbb\n" +
			"2-6 z: gzlnpzpkhjwwqtswcrz\n" +
			"5-6 d: dddsdkd\n" +
			"1-5 w: dxwkgwwwwwwmwwwww\n" +
			"4-7 q: qqqnwqlqrqdcqpq\n" +
			"6-9 m: lmmmdmmvmmmm\n" +
			"7-8 h: hhhghhxh\n" +
			"2-3 j: jjjj\n" +
			"1-4 r: rrrw\n" +
			"4-7 m: mmjmmrm\n" +
			"4-5 j: vljjrj\n" +
			"19-20 j: jjjjjtjjjjjjjjjjjjgx\n" +
			"2-6 h: xhltfh\n" +
			"5-11 s: ssssjsssssss\n" +
			"3-4 b: bbbb\n" +
			"1-5 g: chgmtgnn\n" +
			"6-7 j: jjjjjjz\n" +
			"3-8 c: cccccrccccc\n" +
			"3-17 s: sslstssssssssspsgs\n" +
			"17-18 x: bxxxxxxxqxxxxxxxkwxx\n" +
			"9-10 q: qfqqzqqqsddqqqqqqq\n" +
			"6-10 k: kmkkkxvqkrk\n" +
			"5-9 f: kffffffffcdfffffplf\n" +
			"5-6 r: rrrrrz\n" +
			"2-5 d: hdgzt\n" +
			"7-10 k: zkrllwkkkjrkqfkkk\n" +
			"9-11 b: bbrkbbbbcbqqb\n" +
			"8-12 g: gfgkgggggggggggggg\n" +
			"12-14 s: sssjsspstlvlsrsssss\n" +
			"4-8 g: pqgzcgvgflgntlp\n" +
			"13-14 j: jjjjjjjjjjjjjx\n" +
			"4-6 k: kkkmqpk\n" +
			"3-5 j: sjjbjlvjjvjr\n" +
			"2-9 c: ckccjxzcrcctbfn\n" +
			"10-12 n: hvnnnnxnntnlnn\n" +
			"11-15 m: mmrmmmdmmmlmmmjqm\n" +
			"6-8 p: qpzrrpcpbxg\n" +
			"5-8 w: xwdzcgclxwsvfwtwbxnw\n" +
			"3-8 q: qzqzhlzc\n" +
			"2-3 v: hvvvvltft\n" +
			"5-12 s: tgvsswttkwfssnsqjsxk\n" +
			"5-17 b: bbbbbbbbbbbrbcbbbhb\n" +
			"3-6 p: ppjpzw\n" +
			"3-5 k: kkxvkswk\n" +
			"4-8 v: vbvrvxvgrvvwwvvm\n" +
			"3-12 v: njvvgvdcjvvtvvcnvg\n" +
			"4-5 n: bnnnrn\n" +
			"8-9 l: jlvxdlpll\n" +
			"12-14 w: fkwwwwwwcwwjwmwc\n" +
			"1-4 q: wmqrzpqhj\n" +
			"4-7 t: tctsttlt\n" +
			"13-14 h: hhhhhhhhhhhhhf\n" +
			"2-3 j: jmjjjjj\n" +
			"5-6 v: vvvvlv\n" +
			"5-13 v: fnxvvvvvnvqvvvvvws\n" +
			"16-17 l: gllllllllllgwqlll\n" +
			"1-2 s: pnpfsqw\n" +
			"6-13 g: ntzqggvbnwxrgskg\n" +
			"5-12 k: krxmbxqbkhxlnvdxdkkq\n" +
			"14-18 d: ddddddddjdddbdddddd\n" +
			"4-7 z: zzzzxzzs\n" +
			"15-18 d: dddddddddbddddpddh\n" +
			"8-11 x: slxxxxxjkxxxrsdx\n" +
			"4-6 n: nnnfzzn\n" +
			"1-4 h: gslcmnhhfhvz\n" +
			"1-4 d: tddqds\n" +
			"2-3 c: fccp\n" +
			"2-5 k: mkqrknj\n" +
			"9-16 g: gpggdggwgwgwglggg\n" +
			"2-5 h: hhjds\n" +
			"4-5 b: zbnvld\n" +
			"6-14 m: mfqmnmqtdmmzmm\n" +
			"7-8 j: thvcsgjn\n" +
			"1-5 x: xwjdxdqjtc\n" +
			"4-17 r: fqbrqrnpslndrmjdhpjp\n" +
			"4-5 c: ccccw\n" +
			"5-6 v: vvvvdm\n" +
			"5-12 n: nnqzjntfnnnd\n" +
			"3-4 c: nccqlccq\n" +
			"1-10 p: nrvvzpppqpn\n" +
			"9-16 v: jvvrpvvvvvzvhhvvgz\n" +
			"12-13 s: sjsslsssfxxkrssstkss\n" +
			"1-3 t: vtwbh\n" +
			"5-16 q: sxxfrqhqtvzbzqwg\n" +
			"5-9 z: dnzlhzzzsdzz\n" +
			"15-16 d: pdddddjddpkdddtdddd\n" +
			"3-4 p: pplqppp\n" +
			"7-9 s: scsslshsqssw\n" +
			"2-3 v: vxvxv\n" +
			"8-9 w: wqwwwwwgshww\n" +
			"8-9 k: kkkkkkkkc\n" +
			"9-10 v: vhfvvnvvtvvb\n" +
			"1-12 z: zzzbzzzzzzzdzzzz\n" +
			"6-7 b: bbbbbwhb\n" +
			"12-13 z: zzzsvtlzzzzzz\n" +
			"1-3 s: pssssssxw\n" +
			"8-9 w: xwwwwwwdzw\n" +
			"1-4 x: xxkxxx\n" +
			"10-12 f: fffffffpffvffff\n" +
			"18-19 w: wwspwwzwwqcrwwhwwww\n" +
			"6-8 s: ssssstsks\n" +
			"5-6 j: jjcjgm\n" +
			"2-5 p: wprwpxbdkrfpmppqpd\n" +
			"8-18 n: nnnnnnnnnnnnnnnnnn\n" +
			"4-11 c: txncpqclrlc\n" +
			"2-10 f: ffcffftfffxrxf\n" +
			"1-4 t: ttttttt\n" +
			"4-9 f: zdpjffffbfbl\n" +
			"6-7 f: kfsffffffm\n" +
			"1-4 b: bbdn\n" +
			"6-12 k: kkhkkkkdqkbkjkkkl\n" +
			"3-4 n: kmnn\n" +
			"4-11 l: kllcllldllclll\n" +
			"7-19 w: pfwdwdnkblwzgkfnfmh\n" +
			"3-9 z: zzphzdnhqwlzzwzz\n" +
			"15-16 h: hhhhhhhnhhhhhhhd\n" +
			"1-4 l: vllll\n" +
			"2-13 l: hdhvgdrlltlmjptzq\n" +
			"1-3 p: njvpltppbkxpfpppp\n" +
			"1-2 j: kkjv\n" +
			"10-11 c: ccccccmcccjcc\n" +
			"5-8 v: tqvmvtwvzfczvvvvw\n" +
			"6-9 x: xxmxxxfxxxxx\n" +
			"1-10 z: zgzzztmdtkzzpxztbgpp\n" +
			"10-12 g: ggwzjgdsgbnggl\n" +
			"5-6 j: jvxjvjj\n" +
			"4-7 x: xnxxmgxxtjxxkj\n" +
			"13-14 d: ddddmddddddddd\n" +
			"12-15 c: cccccccccccnccc\n" +
			"16-17 n: nnnnnnnntnnnnngnmn\n" +
			"1-12 m: bzckgvmmbdcxtgtmb\n" +
			"4-7 l: ljllllljl\n" +
			"5-11 w: wzvzwwrkmtwh\n" +
			"11-13 l: lmtpwxlllhlgllwvqnp\n" +
			"6-10 f: fvgkffqvcfffdbfff\n" +
			"3-5 j: kbfjjj\n" +
			"1-2 h: hhztdpbttnc\n" +
			"8-10 b: bbbbjbbqkbbbd\n" +
			"1-13 c: hccvcxtcclpckzd\n" +
			"6-10 w: wwwwwtwwzrwwf\n" +
			"2-3 j: fjnnj\n" +
			"2-4 j: njtjjjxrjv\n" +
			"4-5 w: fwwzw\n" +
			"7-9 k: qbnkghdbqlz\n" +
			"2-9 s: dsdftlzsszlf\n" +
			"4-5 v: vvvvd\n" +
			"1-2 w: fbfwwb\n" +
			"4-7 t: tttttmt\n" +
			"3-10 h: hhhhnhhhskhh\n" +
			"3-8 w: qwswwswfl\n" +
			"1-3 p: pmpgpp\n" +
			"2-7 n: nmmgnssmtn\n" +
			"2-3 j: djvjgjp\n" +
			"6-13 x: jxxbxxgnxvbxx\n" +
			"6-10 v: vrvvvvvvdz\n" +
			"2-3 b: bbbbjrkwnc\n" +
			"1-2 h: fshnf\n" +
			"1-5 n: htsknrzqnntknfnjx\n" +
			"5-9 d: kkgtwrdjmxkzc\n" +
			"12-13 x: xxxxxxxxxxxxx\n" +
			"2-10 m: wmmmmmdpmmmmh\n" +
			"2-12 n: xttqcmfkvnlkzskjhmzn\n" +
			"6-9 m: mmmmmxmkp\n" +
			"10-16 m: gmmdqmjmflmmmmmcmmm\n" +
			"13-14 p: pprprppppspxfgnptppp\n" +
			"1-16 b: gcnbbnbbmsjxnbppcb\n" +
			"10-11 d: dkdddddfjmpvdddd\n" +
			"1-9 f: zlfwstnzp\n" +
			"14-15 n: nnnnnndnnnnnrnnvcndn\n" +
			"2-6 l: lvvldlzdzgdf\n" +
			"6-10 z: zzzzztzzzhzz\n" +
			"13-14 n: nnnnnnnnnnnngln\n" +
			"8-9 z: zjqztzztqzzbxzz\n" +
			"2-3 v: dwcv\n" +
			"4-6 m: kmmmkmm\n" +
			"5-9 g: wtgfgdmxkx\n" +
			"3-5 b: vbzbf\n" +
			"10-11 w: wwwwwwwvwwz\n" +
			"2-8 s: sztstsnssq\n" +
			"2-6 l: lldzcslxdwghmn\n" +
			"1-2 n: vmznndnnnbrhknjwzkzx\n" +
			"3-4 k: kknp\n" +
			"1-5 h: hhhhhhh\n" +
			"12-13 z: zzzzzlszzzzzxz\n" +
			"1-12 m: mtbspfpdgpznrsmvgq\n" +
			"11-13 q: qqqqkqnqhqrqrq\n" +
			"14-18 d: dtdrdddddddddxfddddd\n" +
			"1-6 q: bqqqqqgqqqq\n" +
			"1-7 c: dlmvcsztzpx\n" +
			"4-6 g: gmgggg\n" +
			"5-6 s: ssswsssgdghv\n" +
			"8-9 k: kkkkkkkgn\n" +
			"1-17 s: ssssssssssksssssss\n" +
			"4-5 b: qqtlsh\n" +
			"5-6 g: gggggg\n" +
			"2-11 r: drkpvrrlrtrvrjhpd\n" +
			"3-7 k: fkkhmddh\n" +
			"6-7 h: hhhwhnfph\n" +
			"3-4 p: ptppmwpnps\n" +
			"3-6 w: hwcshlrm\n" +
			"7-8 d: dtddqddzn\n" +
			"1-6 s: sslsbssbsg\n" +
			"12-15 n: tbnnjknnkwnnnnsnnnz\n" +
			"8-9 z: zzzzzzzzz\n" +
			"2-5 w: kjnwn\n" +
			"4-7 m: mmmtdjmmmmtl\n" +
			"4-7 h: dqfhzrqhfhntzhkhhdvb\n" +
			"3-5 g: zvflgg\n" +
			"5-12 s: lvsvqnvssgcx\n" +
			"11-19 p: pcppvppplpwppppjlps\n" +
			"5-19 p: gkpmfxlmppczdnhbqcw\n" +
			"5-17 b: mdzljsdvxdmbbbbddvrw\n" +
			"1-5 s: shpdss\n" +
			"2-5 t: btggtltvw\n" +
			"1-6 b: sbbbbbb\n" +
			"3-6 w: wwpsfkwnrrr\n" +
			"13-18 f: ffffwfffsfffwffffn\n" +
			"4-5 m: mpmmmxmmggvnb\n" +
			"5-6 z: pwsqhcztlf\n" +
			"8-11 d: ddddddddddlf\n" +
			"1-2 t: xttt\n" +
			"6-8 m: mmmpmvmmm\n" +
			"16-17 h: hhhhhhhhhhhhhhhrw\n" +
			"1-5 g: gpgpgg\n" +
			"3-7 p: gplrpzp\n" +
			"11-18 t: ftqnxttzttxtgttntrtt\n" +
			"10-11 z: zzzzzzdzzlgzzz\n" +
			"3-10 z: lzfzzzzszbzzztj\n" +
			"2-10 l: khdbddnxltnk\n" +
			"4-8 b: tbbcjsnbrbhfb\n" +
			"3-6 x: xgsxmn\n" +
			"9-13 t: ttttttttmtttt\n" +
			"7-11 l: fllllllzllmdshrll\n" +
			"18-19 g: hffqfwssgqpcnmddkcw\n" +
			"3-4 m: mmhvmc\n" +
			"1-3 w: vwnw\n" +
			"5-6 r: rrrrrb\n" +
			"2-4 j: rjqj\n" +
			"5-7 b: kgblcbbdrb\n" +
			"3-5 g: jgggggg\n" +
			"1-11 v: vvrvvhxvrvvnrvvv\n" +
			"3-14 w: ncwphcwvjwhdpwqkg\n" +
			"6-7 x: xxxfqmkvxx\n" +
			"13-14 v: vvvvvvvvvvvvkt\n" +
			"2-12 x: xzcvvxhhwwxxc\n" +
			"6-14 m: mdtnmjmhmnmmmmm\n" +
			"15-16 z: zzzzzzzzzznzzzzzzz\n" +
			"4-6 s: mcssdssjshscvcl\n" +
			"11-12 b: bnbbbmbjsbxbbbbbj\n" +
			"7-13 c: cccfhccczccwcccsc\n" +
			"3-4 m: cgtmmm\n" +
			"5-10 l: hxhbggrllmtgn\n" +
			"6-8 d: sdfdddlv\n" +
			"4-9 x: xxxxxvxxcx\n" +
			"11-12 c: rcmqkzjccccrdccmc\n" +
			"1-3 g: jgng\n" +
			"4-5 l: lvlll\n" +
			"9-16 n: rnnnqjnvqnnnlnnwdnnn\n" +
			"4-10 x: crdxgxrfjhr\n" +
			"1-5 f: tgdffffffqf\n" +
			"15-16 q: qqqqqqqqvqbfqknqqqqq\n" +
			"9-11 s: sssnffssksq\n" +
			"3-4 v: vqvvv\n" +
			"5-19 z: jthjzpgmwjbftzvmnpzk\n" +
			"3-10 w: mpxhrrnqdvncwssqwlxz\n" +
			"14-15 b: bzbbbbbsbbbbbbbbbbb\n" +
			"3-5 j: jpjvjjrjtmjj\n" +
			"3-6 w: wwmwwzw\n" +
			"1-6 c: ccccvzcccm\n" +
			"10-11 m: mmvwgmjmmmrqjmmmglm\n" +
			"2-3 f: fffw\n" +
			"6-12 m: bmbzmmrshmmz\n" +
			"5-6 n: nnnnnn\n" +
			"4-5 k: kmsgkwvkk\n" +
			"6-8 t: tttttbttt\n" +
			"4-5 j: vtmvsqjl\n" +
			"5-6 q: qshzdqqk\n" +
			"1-3 w: dwgw\n" +
			"8-9 q: qbqqqqqwq\n" +
			"5-10 m: lmmmkgmmwb\n" +
			"6-9 n: nnnlnnnnn\n" +
			"4-5 t: tntct\n" +
			"6-8 g: hgngghgw\n" +
			"6-9 t: gttwtgvpgtlt\n" +
			"6-7 l: lllllll\n" +
			"4-5 j: jhjkjjm\n" +
			"13-15 h: hhhhhhhhhhhhxnh\n" +
			"1-4 m: mmmmm\n" +
			"4-6 q: cqrtqsdqqzrknf\n" +
			"9-13 f: fffffffffzfvff\n" +
			"2-16 p: prxdxjpkppgpxsjwpppp\n" +
			"3-4 r: rrzh\n" +
			"1-2 g: cglblsnkg\n" +
			"1-3 f: xqnfwjmmwqffd\n" +
			"13-14 q: qqqqqqqqqqqqvjqq\n" +
			"18-19 g: dggggggggggggggggvgg\n" +
			"5-6 s: dsssssss\n" +
			"4-6 z: szdzzb\n" +
			"9-12 t: xtltpgftttmtt\n" +
			"10-16 m: mqmmmmmmmcmmmmqx\n" +
			"3-7 c: cpccngcvccm\n" +
			"2-16 s: jsdfsjsjtswhkvmsskj\n" +
			"2-3 c: kccc\n" +
			"4-16 k: qhndnqmrvjcczfkpds\n" +
			"4-6 n: nnnrkxl\n" +
			"9-10 s: ssssssssds\n" +
			"2-3 z: hfzcz\n" +
			"2-3 s: sssz\n" +
			"8-10 b: qbbbjbbbbw\n" +
			"7-16 k: gcvskkjkkkkwkzkz\n" +
			"7-9 n: nnnnnnhnnnn\n" +
			"1-10 q: qjxqmqxcgg\n" +
			"9-11 l: jdhjbbcnlzll\n" +
			"7-14 l: llrlxlllllltlnl\n" +
			"3-6 f: wfdqfbrf\n" +
			"3-8 t: ttzttmtvttzpl\n" +
			"10-12 v: vfvvvvvvvsvv\n" +
			"5-6 v: vvvvvm\n" +
			"11-13 t: ttttxtttttptttctttt\n" +
			"3-4 k: kkdm\n" +
			"4-6 n: nnnlnt\n" +
			"13-15 m: mmmmmbmmmbmmmmmm\n" +
			"5-6 l: klllnl\n" +
			"2-3 f: flzff\n" +
			"3-4 r: frrs\n" +
			"1-5 d: cqwkvsdqdvb\n" +
			"9-15 l: jvtfqczlnlwdpclxwp\n" +
			"12-14 t: ttttttlqtpttnt\n" +
			"11-12 m: mmmmmmmmmmmm\n" +
			"4-5 j: jjjkbjjjjj\n" +
			"9-12 w: wwwwwwwwkwxkwcb\n" +
			"6-12 q: tcqrqqqqxjqqqqmqhq\n" +
			"5-6 m: mmmsmmmm\n" +
			"2-5 t: mttbttprttddtv\n" +
			"10-13 t: tttttttttttztt\n" +
			"10-11 f: kmqfxttfkfd\n" +
			"5-7 v: vrlzpvjtvv\n" +
			"6-7 l: nlllllj\n" +
			"1-5 q: szdbqqkqqtkmssq\n" +
			"3-4 q: kcmlwqzczwms\n" +
			"13-16 b: bsbbbbbbbbrbsbbpzbb\n" +
			"9-11 d: dddsdbddkdkdd\n" +
			"2-15 j: xkjnntffvvxfnntcv\n" +
			"4-6 v: hvvvcvqvrwv\n" +
			"9-12 j: qjjjjdjgqhrjjfjrdj\n" +
			"8-10 v: vvvvvvvnvnvv\n" +
			"4-9 t: ttttthttt\n" +
			"8-16 g: ggggklggcggggxgg\n" +
			"1-3 z: wpqz\n" +
			"4-5 g: wgdnmxccgj\n" +
			"8-11 r: rrrrrrrxrrmd\n" +
			"1-9 f: ffffsfgdbsqfffzf\n" +
			"7-8 q: qzqqqqrrq\n" +
			"12-13 n: nnnnnnnnnnnnnn\n" +
			"8-12 j: jpjjjmjjjjjzj\n" +
			"1-4 j: nvjw\n" +
			"7-13 z: zzzzsnzxzznzrzgzzzz\n" +
			"14-16 z: zzzzzzzzzzzzzzzm\n" +
			"1-4 x: xxxxnxh\n" +
			"8-15 k: gnrkktkpcmklkksnkk\n" +
			"2-4 h: klph\n" +
			"11-16 c: ccckzdccgckpcccsc\n" +
			"15-16 l: dlllllllllllllll\n" +
			"2-3 s: dsxss\n" +
			"1-4 v: jvvv\n" +
			"2-8 t: ktkdtxkt\n" +
			"1-3 t: ftftttttt\n" +
			"4-5 k: kkkbkk\n" +
			"4-6 g: llqcggg\n" +
			"4-14 r: fmdvrrwlstlbjr\n" +
			"2-16 p: rpdfhpbqfwxlxhhc\n" +
			"6-8 j: jjjjjjjjj\n" +
			"1-7 f: fnnffblbqffkrff\n" +
			"1-3 k: rfqwlnnkzdq\n" +
			"15-16 s: ssssswssssssskssss\n" +
			"11-13 z: zzzzngfzzzzzz\n" +
			"5-7 h: hhbhhcnhfghhhv\n" +
			"2-7 j: zjrmjgmjdkp\n" +
			"5-8 z: bzzzpzzrzzzz\n" +
			"12-16 j: jtjnjjjjgjjjjjjsj\n" +
			"5-9 s: ssssssssms\n" +
			"2-3 s: ssss\n" +
			"13-14 d: ddddddddddddkt\n" +
			"12-13 r: wfdtrknrhvrrc\n" +
			"6-8 p: vpxphxngzhnkppppfp\n" +
			"2-3 j: jtjx\n" +
			"3-6 k: tkkvjkb\n" +
			"2-6 t: tvftftvbfx\n" +
			"5-7 z: zzzqzzz\n" +
			"14-15 h: whdhxhhhhhhhfxzhhh\n" +
			"3-4 g: ngjgg\n" +
			"9-10 z: zzzzztzztq\n" +
			"2-7 f: fffffqfszchff\n" +
			"4-6 f: lfqjnzccffjslsdf\n" +
			"5-6 z: lpzzzzsz\n" +
			"11-13 t: tttttwtttttttttttt\n" +
			"2-6 z: zzzzzz\n" +
			"9-10 m: mmmmmmmmjm\n" +
			"5-6 w: xwggfcwvwlx\n" +
			"1-4 j: jjjjjljjjjjjj\n" +
			"8-10 t: ttttttwttt\n" +
			"5-12 x: zxxxxxxpxxxn\n" +
			"3-4 v: vvlrv\n" +
			"3-6 h: hhhwhlxhlrhl\n" +
			"2-5 p: cptsjktp\n" +
			"4-11 j: bmjjjjjjnwwdk\n" +
			"15-17 p: ppppppppppfpppvpp\n" +
			"7-11 m: wnnmmwmtmmxmm\n" +
			"9-19 k: kkkkkjkkhwkcvkkkmknw\n" +
			"11-15 s: sspssbshssscssssss\n" +
			"1-8 s: sssssmssssssssssss\n" +
			"4-8 x: xxxxdxxx\n" +
			"9-10 n: nnnrnlnnnnnnnnnnnnnn\n" +
			"10-11 d: ddddddddddn\n" +
			"5-9 z: tzzzqzbmzzzqzjkzlr\n" +
			"9-20 f: fffffnfffffffsfnffff\n" +
			"5-6 g: gvggggg\n" +
			"13-14 x: xxxxxxxxxxxxxxx\n" +
			"6-7 v: vvvzvvvv\n" +
			"5-10 l: kbcvlfvlszndtlldjlh\n" +
			"4-9 s: vkcsdvszthkwmmmxs\n" +
			"3-4 b: jbmb\n" +
			"2-4 w: nmwm\n" +
			"5-10 z: tztzzfzgdzzszq\n" +
			"2-8 k: kzkkkkzwf\n" +
			"16-17 d: vxvzdgzwssqdcgbdb\n" +
			"4-5 b: bbbbb\n" +
			"7-9 w: wwfwwwjwln\n" +
			"5-12 k: ljkkkqfvqtkkxsd\n" +
			"5-7 q: qqqqhqqq\n" +
			"8-9 n: vnnnnnnpstnn\n" +
			"5-10 m: mmgzmmmmmm\n" +
			"3-14 q: qgbvqjxqnqqqqqqq\n" +
			"2-4 c: cccc\n" +
			"3-7 b: szbbkbdbmbbzbqs\n" +
			"1-5 m: mhmmc\n" +
			"3-6 n: nnlvnnvnq\n" +
			"2-3 c: mccc\n" +
			"11-12 m: ddmmmmxmmmmwfmmm\n" +
			"8-10 n: nnnnnrnnnn\n" +
			"1-12 g: sgbggglnggddgggsngrx\n" +
			"7-9 p: phppppppp\n" +
			"4-5 q: qxqqqq\n" +
			"3-7 v: vwsvvrvxvvvvvvwvvdlv\n" +
			"8-18 j: jmjcjjltjmjwjzrllgcj\n" +
			"2-14 r: rdrrrrrrrrrrrp\n" +
			"2-4 r: cxcbkmr\n" +
			"6-9 r: vtlnnvbcndqhrxkkjp\n" +
			"2-3 s: hxssnsswzc\n" +
			"10-16 r: csrsrxrrrrrrfrfdrr\n" +
			"7-9 w: wwbwmvrwdxww\n" +
			"12-14 p: pppbpppppppgpt\n" +
			"2-7 n: nnnnnnnn\n" +
			"3-12 f: mhjxfxgbbvffpclfffg\n" +
			"10-14 l: lllskllljllllll\n" +
			"11-16 l: lwlklllglzllllllll\n" +
			"13-14 h: hhhhhhhhhhhhhdhhhh\n" +
			"1-2 t: tttb\n" +
			"1-6 z: zzzrrzzbf\n" +
			"1-6 v: jrvzvvrs\n" +
			"3-6 g: jggbnl\n" +
			"17-18 x: xxxxxxxxxxxxxxxxrx\n" +
			"8-17 f: xnmffffbwfdcfrdfw\n" +
			"3-9 k: jmkdvkdnk\n" +
			"7-9 m: mmmmmmdml\n" +
			"9-11 c: cdmshccckqmcccccckp\n" +
			"16-17 g: gggggngggggggggggdg\n" +
			"7-8 n: nnknnnnnnn\n" +
			"3-13 n: fjhgrspsnkmnf\n" +
			"14-17 z: zzzzzzzzzzzzzqzzzzzt\n" +
			"13-14 r: rrrtrrfsvrzngw\n" +
			"7-8 k: kvkvkpvc\n" +
			"1-2 b: bbpbb\n" +
			"1-7 n: tchnrtbtldnmnnvvnn\n" +
			"3-4 s: sssssjv\n" +
			"1-9 l: cllllztmlllrzfl\n" +
			"9-10 x: qjxxxxxxdhxxxxxh\n" +
			"6-7 p: ppppfppv\n" +
			"3-8 q: mkqzqqbqzjrqbq\n" +
			"6-8 x: xxxxxxxx\n" +
			"1-7 f: ffffffff\n" +
			"5-16 b: jbbbbbqcbbbbbbfb\n" +
			"9-11 c: ccccccccccq\n" +
			"1-2 x: fqkx\n" +
			"4-12 z: znzzzzzzzzzzzzz\n" +
			"3-4 l: lglll\n" +
			"9-11 m: mmmmmmmmmms\n" +
			"14-17 x: xrxpxgkxxzdrxxxxckxv\n" +
			"3-5 t: gxjbbfcpmkbkxbtwbt\n" +
			"5-6 j: jmjjjj\n" +
			"14-15 g: ggggggggggggggx\n" +
			"6-7 l: lllllbl\n" +
			"2-14 q: qqtsqkqvqqqpxzqqcqq\n" +
			"2-4 w: fwhw\n" +
			"4-5 m: mzmtkm\n" +
			"2-4 g: ghghgp\n" +
			"5-6 r: rrrrnl\n" +
			"1-4 h: chghhw\n" +
			"7-12 r: rrrzglvrrrrsrr\n" +
			"1-7 x: xxcxdwxjmx\n" +
			"5-12 r: rrgrrffwtrrnrrqrrjnr\n" +
			"2-5 r: srdqrlxrkrrdkr\n" +
			"3-4 t: ttdg\n" +
			"11-12 s: bfjrkqqgdtlwrskmfrp\n" +
			"3-5 n: nnrnfzsnm\n" +
			"10-15 z: zzzzhzzqqczxwzqztv\n" +
			"2-7 f: ffgdfgff\n" +
			"7-10 d: ddtbdddddjtdqfdddfq\n" +
			"2-9 k: gkrkkkkkkkkhkqkx\n" +
			"13-14 n: nngnlnnnhnnnnnnnn\n" +
			"6-9 r: qrxrxzrff\n" +
			"7-9 m: mmmmmtmqqmml\n" +
			"11-12 p: pppppppppppp\n" +
			"10-13 j: jjjjjjjjjznvbjj\n" +
			"1-2 c: ccvc\n" +
			"7-8 m: mmmmtdmckkpmcbkjmm\n" +
			"5-8 j: sjptjjbjjjjj\n" +
			"6-8 d: jchdwrhd\n" +
			"5-6 z: lqzzzzkrzzvzwbbzktp\n" +
			"6-8 l: ztbltlll\n" +
			"2-3 z: zkrxzp\n" +
			"7-18 g: phgpgggqgzgnmwlpkwd\n" +
			"8-9 f: hffffffqf\n" +
			"17-19 p: pppppphpppppppppzpp\n" +
			"2-3 z: zzzfg\n" +
			"1-2 v: bfvj\n" +
			"4-8 b: bcbbbbbb\n" +
			"15-16 s: ppsnsssssssnssss\n" +
			"2-3 m: mnsm\n" +
			"2-4 h: hwfshh\n" +
			"9-15 h: hhwhhhhxhhhhhhh\n" +
			"17-18 n: nnnnnnnnnnnnnnnnnn\n" +
			"7-11 n: nnnnnqpnlbgqnqnshn\n" +
			"15-16 j: cdjmbcwdppvvjqvv\n" +
			"6-11 p: ppplppppxpt\n" +
			"4-5 r: rrrrrr\n" +
			"10-11 w: wwwwwwwwwww\n" +
			"3-7 p: pzppzspppmkxbldwpnwf\n" +
			"2-12 w: zwdljlzwgxfwvtdm\n" +
			"2-10 f: mzfjqfspgfrfhst\n" +
			"14-15 m: mzmmmvhwmdmmdpz\n" +
			"1-12 r: vrxrrtrxgvrd\n" +
			"4-5 n: nnnnnnpn\n" +
			"6-12 x: xkbwfsxxxxxkxxxxk\n" +
			"4-6 n: mncnxn\n" +
			"9-10 f: ffffpfqftbf\n" +
			"3-5 b: bzwbk\n" +
			"4-7 c: ncdcccc\n" +
			"11-12 t: dgdkrjgsgtlf\n" +
			"8-11 z: rqzdjqznrpkzmblbt\n" +
			"1-3 z: zfzx\n" +
			"2-4 z: kzgzkp\n" +
			"6-10 v: jvvvvvvvvs\n" +
			"2-9 v: vrvvvvvvvc\n" +
			"5-6 q: qqqqqqc\n" +
			"6-10 p: ppdknlgpqkp\n" +
			"10-13 z: zzzzzzzzzzzzvz\n" +
			"19-20 g: dtckblrmggknmxwnrjgg\n" +
			"4-18 p: ppcjpqfpcxtphlppmhcx\n" +
			"6-7 n: nnsnnknthn\n" +
			"10-11 f: fffffffffff\n" +
			"2-4 f: ffccltsfgk\n" +
			"6-11 d: dsqddtddddjcnssrcd\n" +
			"7-13 x: xxxxxqlxxxxfw\n" +
			"12-13 r: rrrdrrrrrmrrrr\n" +
			"15-17 p: pqppppppppppvppppppp\n" +
			"7-8 j: jjjjjrdp\n" +
			"4-6 v: vvvvvt\n" +
			"1-4 t: tltftjtjhz\n" +
			"9-15 j: jjjjjjhjjjjjjjkjj\n" +
			"6-7 c: ccccccccz\n" +
			"8-9 x: xxjxxxxxsx\n" +
			"4-5 h: hhrhh\n" +
			"2-3 g: cgnm\n" +
			"8-10 l: llqlgllzlvrllg\n" +
			"12-13 c: cvnbccpzzxcccfh\n" +
			"3-8 z: zbzrwzzzwrzbqnr\n" +
			"6-7 n: nnnnnnn\n" +
			"8-11 j: tjqjrjggjxxjggjj\n" +
			"7-12 l: bsvxdhljlcsj\n" +
			"3-6 j: jjfjjjjb\n" +
			"2-3 z: dzztwhmzqdx\n" +
			"9-12 v: vvvvvvmvzvvcv\n" +
			"13-14 v: vvvzvvvvvvvvvk\n" +
			"6-7 g: fgggghgng\n" +
			"13-14 h: wcghlwdbjhpdphkcv\n" +
			"1-2 t: nncsg\n" +
			"6-7 w: kwjwwxlwz\n" +
			"4-5 z: zzztvz\n" +
			"3-4 n: nvbvngnw\n" +
			"15-17 z: zzzzzzzzzzzzzzzzzzp\n" +
			"8-10 r: rrrstrgxrhrr\n" +
			"8-10 g: cggggggvgcg\n" +
			"1-4 m: mmvbz\n" +
			"3-14 j: bdbhbjnjnrldhwlbrkrj\n" +
			"1-4 r: rrkrnnd\n" +
			"2-3 f: fvwc\n" +
			"4-13 c: ccccvcgwbhwrcqf\n" +
			"3-9 c: jcghltcfkjchxmccccbs\n" +
			"3-5 h: hhhshm\n" +
			"5-9 h: hhhsjhhhhgthfgldw\n" +
			"4-12 h: mcwvwwphwwbc\n" +
			"6-11 g: gqgggvggggh\n" +
			"9-15 x: xxxxxxxxxxxxxxsx\n" +
			"16-18 t: rmqqtbtvttsdtjvbttl\n" +
			"9-20 f: cllnvlfkfrwzpqxwqgnn\n" +
			"9-18 v: vvvvvvvvzvvvvvvzvxvv\n" +
			"4-5 f: fzffbfvfff\n" +
			"1-5 p: pppppp\n" +
			"1-7 z: zjvchwzqjrtxzgz\n" +
			"4-9 v: vvvvvvvvvv\n" +
			"5-8 w: cwwwzwwb\n" +
			"7-8 r: rrrrxrrr\n" +
			"8-9 f: sgdcqfhfcfsflb\n" +
			"3-7 g: gdgtnfggq";
	
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
