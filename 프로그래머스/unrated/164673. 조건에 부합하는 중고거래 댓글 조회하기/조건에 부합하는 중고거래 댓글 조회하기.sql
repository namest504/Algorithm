-- 코드를 입력하세요
SELECT  board.TITLE,
        reply.BOARD_ID,
        reply.REPLY_ID,
        reply.WRITER_ID,
        reply.CONTENTS,
        date_format(reply.CREATED_DATE, '%Y-%m-%d') 
from USED_GOODS_BOARD as board
inner join USED_GOODS_REPLY as reply
on board.BOARD_ID = reply.BOARD_ID
where board.CREATED_DATE LIKE '2022-10-%'
order by reply.CREATED_DATE ASC, board.TITLE ASC