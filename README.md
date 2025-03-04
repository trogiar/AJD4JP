#  AJD4JP (Astronomical Julian Day for Japan)

## Overview

This repository mirrors the source code of [AJD4JP (Astronomical Julian Day for Japan)](http://ajd4jp.osdn.jp/), originally hosted on OSDN but now difficult to access due to OSDN's acquisition.  
The copyright and licensing terms of this source code remain consistent with those of the original AJD4JP.

このリポジトリは、 [AJD4JP (Astronomical Julian Day for Japan)](http://ajd4jp.osdn.jp/) のソースコードのミラーです。元々はOSDNで公開されていましたが、OSDNが買収されたことでアクセスが困難になり、プラットフォームの移行等も行われていなかったため、個人的にGithub上へ複製したものです。  
本ソースコードの著作権およびライセンス条件は、オリジナルのAJD4JPに準拠します。

### Original Overview

This is a Java library for handling perpetual calendar computations specifically designed for use in Japan.  
It supports retrieval of Japanese era names (such as Reiwa), as well as Japanese holidays ranging from the Meiji era to the present—including Mountain Day, substitute holidays (furikae kyūjitsu), Vernal Equinox Day, and the Happy Monday holidays.  
Additionally, it provides calculations for the traditional lunar calendar (kyūreki), Rokuyō (also known as Rokki), the Chinese Zodiac (Eto) for year, month, day, and hour, as well as Kyūsei (the Nine Stars) for year, month, day, and hour.  
Another key feature of this library is the use of Julian Day numbers, enabling representation across an extensive range of dates.  
It also includes formatting functions for dates, such as representing numbers in Kanji numerals, as well as utility functions for converting between and identifying full-width (zenkaku) and half-width (hankaku) characters.

Java用の、日本向け万年暦カレンダー処理を行うための開発ライブラリです。  
令和などの元号や、過去(明治時代)から現在にかけての祝日(山の日、振替休日や春分の日、ハッピーマンデー含む)の取得が可能です。  
また、旧暦や六曜(または六輝)、干支(年・月・日・時)や九星(年・月・日・時)の取得も可能です。  
ユリウス通日(ユリウス日)を使用するため、物理的に表現可能な日時範囲が大きい事も特徴です。  
漢数字での表現など、日時の書式化機能や文字列の全角半角変換・判定機能も持ちます。

## Reference

- https://trogiar.github.io/AJD4JP-Mirror/

## License

[Apache License 2.0](https://github.com/trogiar/AJD4JP-Mirror/blob/main/LICENSE)
