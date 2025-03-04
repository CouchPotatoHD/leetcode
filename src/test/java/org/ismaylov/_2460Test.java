package org.ismaylov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _2460Test {

    private static _2460 task;

    @BeforeEach
    public void setup() {
        task = new _2460();
    }

    @Test
    void applyOperations() {
        assertThat(task.applyOperations(new int[]{1, 2, 2, 1, 1, 0})).isEqualTo(new int[]{1, 4, 2, 0, 0, 0});
        assertThat(task.applyOperations(new int[]{0, 1})).isEqualTo(new int[]{1, 0});
        assertThat(task.applyOperations(new int[]{847,847,0,0,0,399,416,416,879,879,206,206,206,272})).isEqualTo(new int[]{1694,399,832,1758,412,206,272,0,0,0,0,0,0,0});
        assertThat(task.applyOperations(new int[]{312,312,436,892,0,0,528,0,686,516,0,0,0,0,0,445,445,445,445,445,445,984,984,984,0,0,0,0,168,0,0,647,41,203,203,241,241,0,628,628,0,875,875,0,0,0,803,803,54,54,852,0,0,0,958,195,590,300,126,0,0,523,523})).isEqualTo(new int[]{624,436,892,528,686,516,890,890,890,1968,984,168,647,41,406,482,1256,1750,1606,108,852,958,195,590,300,126,1046,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
        assertThat(task.applyOperations(new int[]{38,713,0,0,0,0,562,0,0,974,974,974,974,255,255,64,557,557,854,854,0,0,948,948,0,740,502,502,80,15,0,193,476,639,993,993,0,59,106,106,92,0,0,865,865,616,616,616,616,616,881,492,492,592,0,0,472,472,47,47,47,114,66,346,346,346,346,0,538,538,988,0,0,930,264,425,425,425,310,409,582,582,582,582,802,0,235,355,929,0,30,545,860,0,0,578,454,792,728,631,631,631,0,0,710,367,367,758,33,498,125,125,731,731,904,0,0,0,980,3,3,3,481,481,0,767,543,217,0,0,0,0,242,242,148,219,811,811,0,564,564,0,0,0,468,0,0,0,571,905,905,582,0,0,774,17,65,132,132,0,0,339,0,0,239,239,239,197,218,482,0,0,0,222,844,844,0,538,932,534,376,0,0,778,615,615,615,0,0,0,0,0,331,331,331,0,0,880,0,0,650,650,918,928,473,187,0,890,890,0,0,0,0,397,397,451,564,342,0,412,412,412,262,50,247,23,760,0,493,0,0,0,713,482,388,207,827,366,862,862,554,0,0,510,33,33,598,0,405,945,362,795,795,0,0,0,811,811,641,641,0,0,0,300,947,947,947,0,76,76,0,689,44,44,0,2,2,2,2,68,68,166,259,706,706,0,0,0,0,0,0,0,0,890,0,0,583,583,583,0,854,854,0,0,0,797,797,89,456,0,0,0,0,694,661,0,601,0,658,731,731,286,0,240,240,903,903,0,280,861,861,861,566,566,566,525,525,740,740,740,740,740,0,0,347,347,347,95,95,972,0,71,0,0,0,0,494,0,699,699,699,447,993,816,816,816,0,0,0,0,0,0,213,589,589,589,589,589,484,484,484,593,62,0,62,0,0,76,372,709,393,423,0,564,0,0,0,0,873,0,847,847,847,847,225,530,0,0,0,439,0,910,693,0,0,452,452,877,877,877,186,186,264,944,139,139,139,439,819,0,0,0,165,165,960,874,576,576,576,916,708,708,708,88,88,88,205,205,0,329,329,329,0,0,941,941,941,941,80,0,0,0,0,0,0,954,954,0,217,526,125,125,563,279,279,279,279,279,826,398,929,877,352,191,298,298,500,500,991,991,917,704,860,860,860,860,860,54,54,54,54,904,756,0,48,373,0,112,425,0,0,0,419,162,362,362,272,272,272,272,272,564,502,0,886,439,439,0,0,655,249,249,249,249,0,0,0,0,127,12,12,478,0,0,0,0,378,344,467,467,467,467,358,0,0,143,143,143,143,143,980,403,70,820,900,0,948,407,924,924,334,354,354,0,0,0,0,959,959,959,959,0,422,0,0,66,66,66,66,66,715,715,108,0,0,693,396,396,143,0,108,108,0,0,0,0,0,0,714,714,714,317,317,808,0,0,690,421,0,940,940,239,363,0,0,0,847,537,537,537,657,392,392,334,334,950,0,0,107,926,538,538,589,529,529,142,142,0,0,453,0,0,0,719,651,0,0,0,0,757,399,576,576,576,737,339,563,0,0,265,618,805,244,401,401,214,214,159,0,0,0,0,0,0,0,858,438,0,0,0,891,607,607,0,666,666,666,666,1,0,461,353,353,0,0,979,979,174,174,686,686,686,686,686,456,473,0,369,493,608,915,915,847,929,699,699,0,833,686,713,0,582,260,260,251})).isEqualTo(new int[]{38,713,562,1948,1948,510,64,1114,1708,1896,740,1004,80,15,193,476,639,1986,59,212,92,1730,1232,1232,616,881,984,592,944,94,47,114,66,692,692,1076,988,930,264,850,425,310,409,1164,1164,802,235,355,929,30,545,860,578,454,792,728,1262,631,710,734,758,33,498,250,1462,904,980,6,3,962,767,543,217,484,148,219,1622,1128,468,571,1810,582,774,17,65,264,339,478,239,197,218,482,222,1688,538,932,534,376,778,1230,615,662,331,880,1300,918,928,473,187,1780,794,451,564,342,824,412,262,50,247,23,760,493,713,482,388,207,827,366,1724,554,510,66,598,405,945,362,1590,1622,1282,300,1894,947,152,689,88,4,4,136,166,259,1412,890,1166,583,1708,1594,89,456,694,661,601,658,1462,286,480,1806,280,1722,861,1132,566,1050,1480,1480,740,694,347,190,972,71,494,1398,699,447,993,1632,816,213,1178,1178,589,968,484,593,62,62,76,372,709,393,423,564,873,1694,1694,225,530,439,910,693,904,1754,877,372,264,944,278,139,439,819,330,960,874,1152,576,916,1416,708,176,88,410,658,329,1882,1882,80,1908,217,526,250,563,558,558,279,826,398,929,877,352,191,596,1000,1982,917,704,1720,1720,860,108,108,904,756,48,373,112,425,419,162,724,544,544,272,564,502,886,878,655,498,498,127,24,478,378,344,934,934,358,286,286,143,980,403,70,820,900,948,407,1848,334,708,1918,1918,422,132,132,66,1430,108,693,792,143,216,1428,714,634,808,690,421,1880,239,363,847,1074,537,657,784,668,950,107,926,1076,589,1058,284,453,719,651,757,399,1152,576,737,339,563,265,618,805,244,802,428,159,858,438,891,1214,1332,1332,1,461,706,1958,348,1372,1372,686,456,473,369,493,608,1830,847,929,1398,833,686,713,582,520,251,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
    }

}
