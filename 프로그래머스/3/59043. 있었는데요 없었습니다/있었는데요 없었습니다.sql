SELECT
    I.ANIMAL_ID,
    I.NAME
FROM
    ANIMAL_INS AS I
JOIN
    ANIMAL_OUTS AS O
ON
    O.ANIMAL_ID = I.ANIMAL_ID
WHERE
    O.DATETIME < I.DATETIME
ORDER BY
    I.DATETIME ASC