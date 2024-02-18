SELECT
  ROUND(AVG(sales), 2) as avg_sales
FROM
  (SELECT
    day,
    SUM(total_bill) as sales
  FROM
    tips
  GROUP BY
    day);
