SELECT U.USER_ID, U.NICKNAME, SUM(B.PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD AS B 
    JOIN USED_GOODS_USER AS U
    ON B.WRITER_ID = U.USER_ID
WHERE B.STATUS LIKE 'DONE'
GROUP BY WRITER_ID
HAVING TOTAL_SALES >= 700000
ORDER BY TOTAL_SALES