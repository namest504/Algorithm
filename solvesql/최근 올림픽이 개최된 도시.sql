SELECT
  g.year as year,
  UPPER(SUBSTR(g.city, 0, 4)) as city
FROM
  games as g
WHERE
  g.year >= 2000
ORDER BY
  g.year DESC;