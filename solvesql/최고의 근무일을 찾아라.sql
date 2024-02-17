SELECT
  day,
  SUM(tip) as tip_daily
FROM
  tips
GROUP BY
  day
ORDER BY
  tip_daily DESC
LIMIT
  1;