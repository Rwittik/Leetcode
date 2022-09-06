```
SELECT Score, convert(Rank,SIGNED) AS Rank FROM
(SELECT Score, @rank:=CASE WHEN Score=@previous THEN @rank ELSE @rank+1 END AS Rank, @previous:=Score FROM Scores,
(SELECT @previous:=-1,@rank:=0) AS initial
ORDER BY Score DESC) A;
```