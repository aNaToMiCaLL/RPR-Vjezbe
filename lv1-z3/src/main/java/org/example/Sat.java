package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


        public class Sat {
            private int sati,minute,sekunde;
            Sat(int sat,int min,int sek)
            {
                Postavi(sat,min,sek);
            }
            void Postavi(int sat,int min,int sek)
            {
                sati=sat;
                minute=min;
                sekunde=sek;
            }
            void Sljedeci()
            {
                sekunde++;
                if(sekunde==60)
                {
                    sekunde=0;
                    minute++;
                }
                if(minute==60)
                {
                    minute=0;
                    sati++;
                }
                if(sati==24) sati=0;
            }
            void Prethodni()
            {
                sekunde--;
                if(sekunde==-1)
                {
                    sekunde=59;
                    minute--;
                }
                if(minute==-1)
                {
                    minute=59;
                    sati--;
                }
                if(sati==-1) sati=23;
            }
            void PomjeriZa(int pomak)
            {
                if (pomak>0)
                {
                    for(int i=0;i<pomak;i++) Sljedeci();
                }
                else for(int i=0;i<-pomak;i++) Prethodni();
            }
            int DajSate() {return sati;}
            int DajMinute() {return minute;}
            int DajSekunde(){return sekunde;}
            void Ispisi(){System.out.println(sati+":"+minute+":"+sekunde);}

        public static void main(String[] args) {
            Sat s=new Sat(15,30,45);
            s.Ispisi();
            s.Sljedeci();
            s.Ispisi();
            s.PomjeriZa(-48);
            s.Ispisi();
            s.Postavi(0,0,0);
            s.Ispisi();
        }
        }
