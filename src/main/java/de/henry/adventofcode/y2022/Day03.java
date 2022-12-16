package de.henry.adventofcode.y2022;

public class Day03 {

    public static void main(String[] args) {
        System.out.println("sum of priorities: " + calcPrioSum(INPUT));
    }

    protected static long calcPrioSum(String pInput) {
        long sum = 0;
        for (String line : pInput.split("\n")) {
            char commonItem = findCommonItem(line.substring(0,line.length()/2), line.substring(line.length()/2));
            sum += getPrio(commonItem);
        }
        return sum;
    }

    private static char findCommonItem(String pCompartment1, String pCompartment2) {
        for (int i=0; i<pCompartment1.length(); i++) {
            String item = "" + pCompartment1.charAt(i);
            if (pCompartment2.contains(item)) {
                return pCompartment1.charAt(i);
            }
        }
        throw new RuntimeException("no common item found in rucksack " + pCompartment1 + ":" + pCompartment2);
    }

    private static int getPrio(char pItem) {
        if (pItem >= 'a' && pItem <= 'z') {
            return pItem - 'a' + 1;
        }
        if (pItem >= 'A' && pItem <= 'Z') {
            return pItem - 'A' + 27;
        }
        throw new RuntimeException("invalid item: " + pItem);
    }

    private static final String INPUT = "GGVGlqWFgVfFqqVZGFlblJPMsDbbMrDMpDsJRn\n" +
            "LwzHtwdLHHwDrzPZzzsJbJ\n" +
            "wdLTBvSvHvZVGCjhfN\n" +
            "HsSSnZVHjjssZnJpSJjBHHWgQGcgqqQLQdQFqNgWgqGNDg\n" +
            "rmmRwrtfThtTrbCrGGGcLBDTqDBNQLdL\n" +
            "mwPrrbzPfwvbzhwMMnnjHnBjZlnzMM\n" +
            "gjjdMBgdqdTpJpBcjgRRRlqnvrqfnZtrtZDw\n" +
            "zHShWLhCszCWHVbVzQWCPtQvNZRwtfftfNnrnftlfR\n" +
            "PzPSssHbVhCLFMJFcMFJJMjdJw\n" +
            "ZqJdtpfpjmpJjpnwWdttTCDLLTQFNTzTzrcqrQqc\n" +
            "MsSlBGvBsSGGSlbGsCgggNTgzNLczFQNrNQVQcFzFF\n" +
            "sGHHSGllhvMGhSRGCjtjtjnjnnmHWpWWtJ\n" +
            "tMdjQlHPHsGjsCtsCpwwqfhfnnFMDMrpfD\n" +
            "SbNvWvBRJRWwFSgppgSrfg\n" +
            "RNcNbvzJRcVLRVzTRFLjdHCQttdZdPlHstPl\n" +
            "QWqgpdBflpHNCNWNHHPm\n" +
            "VVMbbJsLFVMhrMJMmRjFNHwHjjCTGSSRFj\n" +
            "mbMsZzsLmVhJZrcLcJhLMtnqvBnZdggplDffvlnlvnDn\n" +
            "prnNnsFnZpnBNdNtFrNnzNQQwTTQZqTHTQJQMwHDMDlZ\n" +
            "jgfgcSmbLmhmcPShghRdmwJTQjTlqGlJQJHqQqGHqQ\n" +
            "hRVhPfbCgbVggLVRSSmRhRPhrrrnCzzsvCvrnvFnNppsvBtd\n" +
            "QJLNDWSWQdLFFFhLdt\n" +
            "npHhHMsfsjpZjznRtmrMCdBwFBFrBdmt\n" +
            "HsjHqRRfnnHRsgfHffZspgzqDGQSWbQTDNGhQhSqNPhDWWbT\n" +
            "bsCmFDsGZCNsDmLDLZBSHSJTHnrZQMQSSQ\n" +
            "jqRpwvfqnnRQrftdBMHddB\n" +
            "phpchwpzjpvwRzwcsnlFsssPCCGzDlsD\n" +
            "rMqzVQfrfVZWZhTdRTQL\n" +
            "cgmtFtjFFJDDtFvSFRZdLlhpHZddmwTZWh\n" +
            "FbcSTtctcvFTJNgtJDGNPnCqMPMfMBfznGVsrMCq\n" +
            "wLJfGJJPZLBfwSLGHbqmhhDHHhFDzfhv\n" +
            "FsnpFjVjplTQCspNlCDbzhMMbqvMvsgmHDqb\n" +
            "lRdlTdTddllpRQFRltVVdFRcwrtrcWWcPrrWPrPSrZWLPc\n" +
            "VGVZhTppGTfPnJVJrFqbsmbSSshHqWqRHF\n" +
            "llzDCzlBLdNcCddlMMNBdCCtWHbFqFRRRsHjWtRwSWqbmjWm\n" +
            "NbcMBBvzzMQLCDBVTQQPVrPQPPZVPp\n" +
            "cdcgfmQdqlqhzzPjzfwpwf\n" +
            "GLBGBDvbvRzGwtnnmPpp\n" +
            "ZRCZBRFSRvLRLFvvbLLFQdHMTHTlQlNqNmqFlWdH\n" +
            "vzjzvHtcHvJcDStLLGSShCbbfF\n" +
            "MWFFTVZRMmMgdQdSQLwQrQwbGw\n" +
            "gFTmgmVZssRsWZRNzJlBHHnnJDvzNPlP\n" +
            "rHrvHpmHZfdGDDGGZd\n" +
            "cTlMsNhllMhGchNPCBlhMQgVDdgDSSWVbWVwRQwRSgbV\n" +
            "lnBjnNNTTMnCTcChPNhMvtzvFGLtJrjFtHHHzHJm\n" +
            "lgpdZZMmGVVzVZzt\n" +
            "HfHLrHqbPbzJJzRJJPTl\n" +
            "HsLWWbDqFrqlqfbsbDqDBncpgFmmvpnmmgpvdvjcdM\n" +
            "GpNVbTpJJNvMBMVvJTGvhnWQQScllnhhWlhVSznV\n" +
            "ZjswwHHLZzGnjWjSjl\n" +
            "sHdftLLtgLfwdtPmHtMbNpMTpNqGRbPvTqPv\n" +
            "sHSNNhNwsllGSGGlWSGWSsFrrVbQrdmFrVrrmnrHmrHr\n" +
            "QQMRZDDRcrcnmRcV\n" +
            "fJfCPMJCzTMZSGsWwsWBwqQf\n" +
            "HwQZZJsHdqqsdJQGRgCgVGgSqgpcGG\n" +
            "ljWWbnPhjBlGpCRCnScSGg\n" +
            "hrrztWlbPjltjMPSdJDZSsHttwsZwD\n" +
            "VzzbmzvpvNhvBDqc\n" +
            "QHSJSQGCwJCGrGQjjcgcBFhdgqdqFdDNNw\n" +
            "rCGJtZrHhhtLRsth\n" +
            "TMWwCLPpMTThrvtMRJjbjRvmJs\n" +
            "fDzcHFfSfFQfZzZRJbdmmqqssqtbSW\n" +
            "WWgGZglcllgPBBCBNVGPNr\n" +
            "wrwwhpTpbqhqrshrrfrFfwfzRJGdNJHNmcFzCCzCRJGzGR\n" +
            "vMggvjQvgPvQjVLMMPSZqWNJGCzcNGdcdzHPPzcmCzPz\n" +
            "qDZWvBZVfDhbTtrp\n" +
            "LpDvHdjVghnjbGrn\n" +
            "FBBBPwwlBlwSfFTWPHPWWhmgngmmnPnmbsngngbGrb\n" +
            "FwftBSCSfWCtwfVQDvHHCMVvdQLQ\n" +
            "ZrQpQlSpNlqQCVnQBmdDqmWDqmWWBDBB\n" +
            "HsZMsJvZzLMHTRwWhgDwmfDBgdhWdf\n" +
            "RZvTzJGzRjFrVNVjlQrS\n" +
            "mqjMwfqlSSPmSrlPhwhVpGRcppWcpcGRcGWv\n" +
            "ssJDJJNgZNDWrRWcRpvr\n" +
            "ZTsTnnsLJQgPnfMwmnMrfm\n" +
            "qsVBvZqWLdfbfvLj\n" +
            "mPNRgmHBBGQrCbSbrdfCCSbC\n" +
            "PlQTGcTTcgGFQQGPTGllpqMzwzpVJZwBMssZ\n" +
            "FWGcNRLRLhwJJQfV\n" +
            "nzbzlDBHSpTDbpDpzHwCqhqwJJghQqQMCCBw\n" +
            "JnzndzpmJFmNsrrFsc\n" +
            "gmRwwDwfnRDJgwZLFQFFNGNQrFBmFbbm\n" +
            "CCVHVWWThSrjVGvbNj\n" +
            "WpdqpplppHCWzlClMMTTZJcJsdscJLLdbDDfZDgL\n" +
            "VNtCCMDllpBqDvtdCczTSgjHlzGSHSGZTZ\n" +
            "hPFPsQhhFhLnbsRnLFssdzcHdsSHSSHgjzHG\n" +
            "QPWPQrPPmbdnbWLFPrrBVrVDBqqNMVwttDtBvD\n" +
            "PPNNRggwgRRgHBhDtwhTwbDs\n" +
            "SFGSFSMCJFMrcrCMSSsbtrTbbZhBvtHhrTHD\n" +
            "MFfSMpflQLQflfLjnLmddsLdddqq\n" +
            "RcgbcrrFscVrwZVCgVGGmHppNNndWnGdNqddqqNqND\n" +
            "jTlSTBSTjLTvlvjjPtvMLlhHnftphtDFNFqDnDHWNddn\n" +
            "QBMQvzzjzvJPjFQMmwZJrgmCCJVRVbbc\n" +
            "CzPJsWCpvsNszsJsNsHlDhMrrJGjhrRVhRGgDDjG\n" +
            "tFFdbqFLFdwctQdfVhjRRghTcrjVRTDW\n" +
            "bwQtFLdLBdFmwnHnWHPBNnHCnp\n" +
            "CNTstGNslRRRstlmNmmTZZqfFwtqgwqgfBPSwSWwqgWq\n" +
            "hpDbcHbpSrcgqqzhhWVfqg\n" +
            "DDcLDjbMjCSsZRNlMv\n" +
            "MhHMCMNbzbMHlcqmGmrmWc\n" +
            "tnPggdZPBPgdtttJpdnwVBnmqQcvlQrQlfGqmfWffBcqWD\n" +
            "VPPwPPLPwLGFGLzCbG\n" +
            "rqBcBmjHTGfPbcVgPG\n" +
            "dlDpsdshzlldlDvsWlWvLQbQBbfLFLbPvbBGQBgG\n" +
            "BlBznnRWzlphphBnhZjZtNNCNmrNqjCqHwHN\n" +
            "mQBvmvBmmLJvvrLtttQrfhGlcRGfRhVGWJVChlRG\n" +
            "MzPswTsbTPPsNgMNszgzMpbMfcRcGflVGRfWSpFRlWWWFhcC\n" +
            "bcPsTbgbbTTwNZzTZzvdjdjtQQndZvdrvdmZ\n" +
            "hQzTQJFFZJrcdcdZFFrGFSVWVRWRwRgRHVMWDCDSWc\n" +
            "lPmpNBnnnsNBnLnfbfnCDWMvwRvDCCMPwwHWvM\n" +
            "HpjmffNlnqqhddTddFZjGJ\n" +
            "BwsLFFbHLbVCSCSFbsbFLsJbqnTtZrRMHTZtrTrZTcRRRRTq\n" +
            "lGhNhpPmmhpztZTBrcpjRqpB\n" +
            "QPzdfzBQNgFJSCwsdLbS\n" +
            "ZsZsSBTgffSCqSSfrMnnMwjqmqmnnnqwMm\n" +
            "bbPPbzVclcPzGNlvzVtmnDBnQmtnQLBjJVLn\n" +
            "zPFGplGGvdPbHplcbzzvdlNBTThgRpCTCTfhfsCCsSRZhR\n" +
            "CVLSVCLVZRsHcnzSRpdZZRCdPlmcMWDDlPNqMqtDMmqPMlDt\n" +
            "TBnGjfQrQJjhfWlPPmPQDNlmlP\n" +
            "fjhhGvjvvrTTBhvTBTbvGVRLzVnbSRZpHddspHRzLs\n" +
            "DDtWjfRfftWMLzSQjzzhWjjwRVPHqFbBbZHVwZBFvFwZvZ\n" +
            "JGllgCJlJsrCGPrCNTPdslvZVVNVbvBqNbbpbbFHpBwZ\n" +
            "CcPdnCdmCJjfcftWhtSL\n" +
            "pgpfddDGHWzDNGNGpRCQjCTFHZZQFQjcRT\n" +
            "bJlhqmMvnlrRQFtTthPVhZ\n" +
            "lvbJrlJMBwfzGNTddB\n" +
            "wpbJGGZpsjvtdWvGWF\n" +
            "HqqhBhBqhhNQHTSHqqNzRHVPvTvddWrjtrjFvrvdTdVP\n" +
            "NRLCRzlqHQtNRBLzQllhhZcgbggwmLDZpsgssDpwwD\n" +
            "pDzFzJFcVMcWJFJFzpLBsqWLZssshsGLGbsS\n" +
            "wqHqfvnfrRwQtdQRthhBbBbZLhPLnBTGsh\n" +
            "CfQqlqvtfHNvMVmzmmMCFDMc\n" +
            "GcgpNHvcSNvpSLphdhsLdQTsdWThhQ\n" +
            "wwzttPrrhQswdhnT\n" +
            "tjJjMJRbRbjztmjtjbgcRsNlgglHpDFSlSvg\n" +
            "VVLvLqqPVlvcqLLdwLbHpzcHSsbRJppHbHpF\n" +
            "CfjjCNGmMWhWjhWHWb\n" +
            "ZmGZffggrDqZvZtlbTqL\n" +
            "TTmmhvBvvHWzHpsPpstpLVdwwsLb\n" +
            "qflfFgNctNcCnCCNDnfFFNDwrslwZbPswwZbJLJZbrlPLL\n" +
            "FgQDDcncStCgtqccjSDTHWMThvhTQMBQhWvWRG\n" +
            "SqhVghPccSBhgSBqWBFNQNsHQHMjCCQQWCwQHN\n" +
            "fLZftnlttcbbtZbZlpZtttQjwsCQjRwwRDQspMRMNNQs\n" +
            "TfLtvbJtZmlbTTTtlJbFvVqPSgBdPqPhFSGBcd\n" +
            "pPPNDptcqtpcDztLDhhngnnJgJTmJwNnwm\n" +
            "HVVCsSClHGBCHslWHbSCGGVngTrJwnnJnQRRBrhQhgJhdm\n" +
            "WTWWWsvVlvGbWCFvjDftPpjqZLLtDz\n" +
            "wWclwtDwRvflvffB\n" +
            "sMMsGdsSTMrJZNqczfdvhvnzCnfv\n" +
            "rspppMjMspSTSMpgLjcPFmwPLmPHwb\n" +
            "tCdSMHtHtRFHdWSSJQSgrrrnghTNJN\n" +
            "BGfcvDsfvsqcvqfGvfGnNLhggBNQJNJQmpgQJm\n" +
            "sGfQDPDZzfDZzclwDzwsDlfjtbdHClFRCMWjbMFMRFWbdj\n" +
            "pJNCcvqCccsVvFCpqsmvWJfCBWgSzBBRrrBRDDgDrSbbgQbQ\n" +
            "TMLnLjjffwfwGdjQjDDBjBrDtztRSb\n" +
            "MdPLGhHnMZhlPHHTFfZvVCpmmmcFcVFC\n" +
            "SwFMfCMRCdQDdMbmdFfdbbnlcVncVCcgLqWcNNnCcWlW\n" +
            "hPjQzzhGzhpPrtPJPpPHrVgnqVVncVVnNHlqVnncNB\n" +
            "ptjGrptztpthtrtJJhTsGwFDZZDQmSdfZSwsRZSwfZ\n" +
            "rSSWWCWrdllHWpjcnFNnRCNjQp\n" +
            "bGwwJqGVGbGJVVhgbBgttGmBQjFsMjpMcMnnMBcQFNnsssvv\n" +
            "bfthwmfJfgwwmmwZqVJPHNHSZHWzSlDPrdDdSH\n" +
            "nmJccvclcbwmlbbvVbvsHwJJPCPNCNPnLBhrBPPLBhLhBgBP\n" +
            "MdRGtdDRTqWDMqtMDtQDRWSdLLBsrhLgBCgrgCgNNLPBfNMf\n" +
            "dRZQdDdRRSQWGsjZmwzjmlzsZH\n" +
            "PBGGMrTQTrTBpPQpLpSlwjwfjtlnfwbmGttw\n" +
            "fCsJCWJcvRCtwwjbCl\n" +
            "NsqcsfcvDHFVDJvdLQTrpdTTzTPpHr\n" +
            "rltrwsBTlrfGZggGBLGGNN\n" +
            "jhMnRQJVphMnbhvQjDZNqqZDNTNHZVHGHq\n" +
            "MRvbhQRQQChpvbjvMSvQnMcsFsfwwmlCwFwWcTWwrmPc\n" +
            "DDvLLLBnvrzvbvbmtv\n" +
            "TMwRjTRMGCwGGwrjQQnmrQrrQdhZ\n" +
            "MJPFHFTwgCGqGqgJMGDfSWcsnBSccgVDlnpW\n" +
            "flzVzNrdLNLJzrGlfdlzjrQDgFTpDgDmmmgFmqFDQjQh\n" +
            "CbnBcsZnPZVSnwvVsZbRhhBDpgFphgmgDgTppq\n" +
            "ZWnsWSnncSZsntZCbsswwJMzdLzlMdNMLtMVfrllMt\n" +
            "ZffSgNfgJgGCHZcZrpHrNJTLhqvSLTqQnvVTLvzvLTjV\n" +
            "tWFtHMwlBlDqjjzjnqvvlV\n" +
            "DRMPDtWHPFDBFFwWMFBmFRPgZpJfsffNGJNrGcsprrsmfg\n" +
            "wRZRmpZmlPqZjzGrdrGq\n" +
            "bBhQQFPQbPDVNzVNzdGWNdrf\n" +
            "QFbcDcDbLHgHBPDFRsSSMtmvRttMpCLS\n" +
            "MpWJVVJMcWvpRShcwpLGflmqzSfNdfNLdQzN\n" +
            "CDBTtCgtbjgCRrBrPBTQqzflNqjGdLzzmqffzq\n" +
            "rFgnnBbttDTPtHCDPrPMnpwVJhJvMZvpMvppRZ\n" +
            "sWTTmpsfsWppPTTsTVZWHVVZNvVcdcJvdN\n" +
            "DjjBzjhRHvvvSzdc\n" +
            "rMBjjrjbjrGDlgMlMrGjBgRLPTTwHMsfnFwFQPMPMnmFFm\n" +
            "QRRbDjjmPzNQwFDNmrQmzCbVHrMhBVrJLJJfMGGLtfJBHh\n" +
            "dsWcsqqWSWvnWnWcWGPJLBqhLBqGhBJHHH\n" +
            "ZWnPWgWgPnlbCDDwmmDbRZ\n" +
            "nfPqqfLqQnfHBSqnzztQjVmjfGRWJNGRWsJWJfmJ\n" +
            "TTMlMMlFDMGVGRsVJH\n" +
            "CbDbFDbvgTFFwgTDlDprhlPSqBzSnPdLPtPPHgznQqBQ\n" +
            "fJmWVfHqjfjhZCQZ\n" +
            "NcNzBNvgszQmzjnthZQC\n" +
            "LsLsgBNFmFgTFgGBBgcdMdvPDPDJWrlpVbGpJWqHDlHJHD\n" +
            "SllDdvzgdFDdlPJvbFDDSzFScPTRTNcwfZRwRhcwwNnRZTtf\n" +
            "WBpWBCLGVpLjHrHGGVhZNwcTVcNhVnRcNZ\n" +
            "LHLQLspHWQGpWCHnBvdzDJFlqvdsqgSgqS\n" +
            "GcTctDMjMhpMDRjLsMMsfDWFfdPCFNbnCPnvCPgW\n" +
            "JmvwqlBwnmfdFPFP\n" +
            "SvZqHSZqqHZZZBlllBwSwsRsMHpLjpLsMGtsMspGRT\n" +
            "ClLnCLfClLVllfLLcQjLBCfCmSHVsttsmtsVStDNVdppdsSp\n" +
            "PFrRMbWqMRwFRqRSqwqvMvMsGtgsdmssrgNtdmpNdDGgdt\n" +
            "bwJbPWPwFFPFSczCZzZZCcfjBJ\n" +
            "MwmBmzwJQTcTmfPVfZPwhhwHPH\n" +
            "jlnrglFLvbrGRFGnvFZdNNFfPZddPThVhdPH\n" +
            "RjbjpgbnLGvpLgzBqBpmWmmzqTMS\n" +
            "FnsSpttPnPbNCFDtsPnFHQZTQZgcwgDDTfrfTHMZ\n" +
            "mRjzRzlvBvhjZrQmMMwfZZNN\n" +
            "ldzddlzLRlRWdhjdRLjhRWtJbJbNtJJpJPbCbGCWNG\n" +
            "wBwmNZBTmzzcVcmpzZqdMgPjnLSVlPgDPdbMdg\n" +
            "flJvGtHffHDddddbHjnb\n" +
            "RstrhfrhhRGFQtRhtftvQhvFZpsmpWwNlWqcWTccBNWswqNp\n" +
            "DPWhbzDlQLLlQbLDlLhPhLFNNJqCFGqnNJCCSCnGPnGN\n" +
            "wvwjtvtdwfssvSJgFFvGGSCFcp\n" +
            "mtdrZwwJsrtddrHRtZWbVThLlBzVTzhHQWhB\n" +
            "TsRRWctsTJMQZllggc\n" +
            "zDvhpbprgGvpvVlVQlZpQMJVlQ\n" +
            "rrrvFvGCDhDSrrrvChCgSstBNTSftWBjTdfWBN\n" +
            "JJdssBcLVGrgbBHWrH\n" +
            "QZTptvmvmlZpRDlMMMZCQvnjjFnrjWGFbjnrnFGWgZrz\n" +
            "TMRplDMggtwlppTlvhsJJqdcqwVPSSNcLd\n" +
            "JjTCCrcRvccPLmMP\n" +
            "NfGFPZlNnwBfPlbbbQZGqLHgzLghSmMBzSgvzmDMhv\n" +
            "ZfbnNQpQnZGlGlGpWTddjdTJdpRPTrCj\n" +
            "gWLblMMggdWsdRJlblMRMMqWDvPvcPPPccJPJVTZVZThmcDP\n" +
            "rQFfGfrCHrjnrtNTcPShTSPvvVLtmm\n" +
            "fQrCfLrpLHnCHwslqzqsslswzqRW\n" +
            "zpJtGlJPMPTlTjGJCDGCDljpdnvhhWnZnZnDwwmvnWDWWvdd\n" +
            "sHrVrSrRRRLNgLVBqSsZmWwvwcvwZjmwngmdbn\n" +
            "QsQQBrrLHTjPpTQzzP\n" +
            "JDlzHHzzptRDmbTMrrVQ\n" +
            "dRRNqnCBnmrQsVQQ\n" +
            "wFPCBNFgwjPwhgFNztftpJRPpzRvvHtZ\n" +
            "DlBhrDBPPwMWwhWchW\n" +
            "ntSqbbSJFJNqzVzjCfMvfSlSRWccRL\n" +
            "mVlHtNVtqldbJVmNHmdTTBBgrQQgGsPQdrDgsP\n" +
            "HWHNbBgvNLdcvQMnSf\n" +
            "wqqqVPDPhqwszFwrrszFfMdWthLcMdfhthSQfJSt\n" +
            "qVPVwTzFwFDpDrPDzDPFDPlCHjBGjTmZGjbWWGZBRTNjjH\n" +
            "GVgdWjllSqgjdgHqqlfmhwcpwCzhvZwMcScv\n" +
            "nsJQbLRQsNnzQDQQPPBbRBRhfZwpZcvwpvvmLCcvpcmfMM\n" +
            "DRJtnnRbBBnPztsrPzRBPbsFFHqqVrqggjFWqrgWjTGgFq\n" +
            "hhZJQPJFHGGlcWWslpNN\n" +
            "VwwwJjvwMtrCnwjDNDzlfscWszWW\n" +
            "nVStCrMqbVwqVqSqwnLPhTJFdRgJHZSFRLTP\n" +
            "vPgMbbRhhvMvNjjLWsWQsHQmHwBrmmBzww\n" +
            "tFctDnVFpppHVBTdzdTQwl\n" +
            "FtSFqSptfJCqqJStZCqDpDJMhvLLgLMgQgjgGZgGgMPLZg\n" +
            "zwsWgSGWLSVhPWhtLgLWhPVNQTmDrDQttZpdQtdpQDDQZQ\n" +
            "fjCHcvvjMDrppCQpVV\n" +
            "VMqRnVJMVLPzbRWhGh\n" +
            "mjRmzQlzDzNHWwDZ\n" +
            "FBfJBGqnnpfSVGnpJbJVfNtCsJHWZvrsNJCZrCNsvN\n" +
            "fZPBnfPqSBqdfpFbVnVSjgdcLLgRLjmgRhLLghlR\n" +
            "FSFnTcppdQtnnDhtzDfg\n" +
            "ZLGVmBLBVwZCVjjGqGhVwVVgzzbMDtNNvszMmMffNDDvtM\n" +
            "VZPJjBZVqBZZBjqwVqllpSTphhQFPShWSQcW\n" +
            "hTRdcLrCLgplLvBFGvlL\n" +
            "nZDZqzbDbDzRZtVNDzDWGwslsllBFpnlpGvJssFG\n" +
            "zbqjNWQVmVPrrRjRdRhS\n" +
            "VpNCbVHlHHZfflVfmchctqFcqQQjZmZM\n" +
            "WDSRGgsSvgJSRrnWgqQhmjBqmhqrtLqmQm\n" +
            "znSGTgDJnsDGzgwCwlpbCNwHzVtl\n" +
            "sTTTrpHFFFqTnQbbvfJdDzHHDLVV\n" +
            "CjMtgMgRvbPfjjvB\n" +
            "mhMvlhhWClvqshNTQQqsNN\n" +
            "tWFtFBzbwdFrpmdhdm\n" +
            "qTqDjJjJQQqMjTDLJjNqNqPNdmpcSmhdmhhmcrWZpdPGddcc\n" +
            "RjNQLJNTTJDDJRHHjQqnMWtlvvVvbtBvRVzgzgwgVg\n" +
            "CGdQjwdJrbBmpmZZZlRWcb\n" +
            "NgtMPVstgSzBLzhgzgLgDRlcmDWRmlZvcSmDSvvp\n" +
            "LhNsgPPLFPPsNzMhhVzPsGJBFqwQGfnqfQjdGdGfwr\n" +
            "CNbNdbzjCZpPNzjmzjsCMRJvnnMRGnsvJGRs\n" +
            "wrtdwTLWFcFWdFgwRRsnJGnGfTGJfMsq\n" +
            "FttcwgBtgVLgPldQSNZBzBpz\n" +
            "DjRZrrRmttRFDvDrFTZsnWnHVSTSSJVZJH\n" +
            "dNNhLqlLLqdCzfMMlCfSncTVVWcHdcVsVdSVnT\n" +
            "QqppMfzMfqWCwbRQrwFrrttQ\n" +
            "dwGjHrtjsdhfCHnPSpfMfDPpPDWS\n" +
            "lmNzzlLbFqcqNgzpWMSvbbvDQDGWDp\n" +
            "LBmglgmqBqmrwCGhCjVtBC\n" +
            "tvHgWZCCprlgpWglCtjPhLmPmhVdJFSzVzdJVmmQ\n" +
            "fBnTTnNNBnwfnNqcBbBBTbGJQQJhSSdQJJsmdJFSQGSmVV\n" +
            "cMcDwFbRfFRlHCRCZrrp\n" +
            "ZFWmgghzBgwgjWBzjzmRWWMmsVwnVrsdVdwNrrpnnVrPCnCP\n" +
            "GLLbtGqllctqvGJvSlQbJGsPnVdsdpsTPLsVppBCTVss\n" +
            "tJBStGSvctvDDfczmRgRZjzDjZmgzH\n" +
            "FMrLmsQQSWzCZBhpQJTQQZ\n" +
            "dPPVncVvPBJDCPhwJD\n" +
            "fvHbbVHvqnvvvBzgLbbGGmrbMr\n" +
            "mrZzrzqDrhZqDddSFrCGLLLPQPQBJPJJBnQq\n" +
            "TgbpGblWlMsjgWlgMfpNRgbRHHBnHHHtLpCJPCPBnBLJtQQL\n" +
            "sbTlblTlvRbbGblbFcdDzccVcDVvzzzd\n" +
            "zMzfzlGwSBMMSCMzhsPgfcPcfcbhjQPt\n" +
            "FHHqJVdJmFmdVrJdJppthscjGtqRPRcccgcQbR\n" +
            "rvNJJpLrvvLnJvNFFvZZZBWznBWGSDCMnCwz";
}
