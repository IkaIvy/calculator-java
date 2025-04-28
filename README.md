# Analiza projekta: Calculator-Java

## LOC (Lines of Code)

- Start.java     : ukupno 15 linija efektivnog koda
- Calculator.java: ukupno 58 linija efektivnog koda

**Ukupno LOC:** 73

## Neformalna statička analiza

| Fajl            | Broj linije | Zapažanje                                                                                                         |
|:----------------|:------------|:------------------------------------------------------------------------------------------------------------------|
| Calculator.java | 8           | Metoda `calculate` ima neprecizno ime – iz opisa nejasno šta tačno metoda radi. Predlog: dati deskriptivnije ime. |
| Calculator.java | 18          | Nedostaje provera deljenja sa nulom – može doći do izuzetka prilikom deljenja.                                    |
| Calculator.java | 31          | Nedostatak komentara u kodu koji objašnjavaju šta pojedine sekcije rade, nejasno za početnike.                    |
| Calculator.java | 45          | Metoda predugačka – potrebno je podeliti je na manje metode prema funkcionalnosti.                                |
| Start.java      | 6           | Neupotrebljen `import java.util.*;` – višak koda koji treba ukloniti.                                             |
| Start.java      | 12          | Previše posla u `main` metodi – deo logike treba izdvojiti u pomoćne metode zbog bolje čitljivosti.               |

## Zaključak

Kod generalno funkcioniše za osnovne potrebe, ali neke delove kode bi trebalo refaktorisati kako bi kod bio skalabilniji i lakši za održavanje.  
Dodatni, detaljniji, komentari i bolje imenovanje metoda/promenljivih bi značajno poboljšali čitljivost i održivost koda.
