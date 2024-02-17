SELECT
  quartet,
  ROUND(AVG(x), 2) as x_mean,
  ROUND(variance(x), 2) x_var,
  ROUND(AVG(y), 2) as y_mean,
  ROUND(variance(y), 2) y_var
FROM
  points
GROUP BY
  quartet;