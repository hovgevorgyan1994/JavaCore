package Homework;

public class Homework1 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print('*');
            }
            System.out.println('*');
        }

    }

}


/*             ՑԻԿԼ 1․ i=1, j=0, 0<1-1, 1/2-րդ ցիկլը false, անցավ առաջին ցիկլի println-ը կատարմանը,

                                           1) * - տպեց, անցավ հաջորդ տող

               ՑԻԿԼ 2․ i=2, j=0 (նորից 0, որովհետև առաջին անգամ false էր, 1/1 ցիկլում բան է փոխվել,
                       հետևաբար 1/2-ը նորից է ստուգում ու true-ի դեպքում սկսում է ցիկլը),
                       0<2-1,  1/2-րդ ցիկլը true, 1/2-րդ ցիկլի print-ը կատարվեց,

                                           1) * - տպեց, անցավ հաջորդ տող
                                           2) * - տպեց, անցավ նույն ցիկլի պայմանի ստուգման


                       վերադարձավ իր(1/2-րդ) ցիկլի հաջորդ պայմանը ստուգելու, j=1, 1<2-1, 1/2-րդ ցիկլը false,
                       անցավ  1/1 ցիկլի println-ի կատարմանը:

                                           2) * - տպեց, անցավ նույն ցիկլի պայմանի ստուգման/ * - տպեց, անցավ հաջորդ տող

                       Ամեն ՑԻԿԼԸ ֆռալուց, 1/2 ցիկլում true-ն մեկ հատով ավելանում է, հետևաբար ամեն տողում ավելանում է *-ը

                       Եվ այդպես մինչև առաջին ցիկլի false-ը
*/


