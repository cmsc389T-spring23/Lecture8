FROM ubuntu
  
RUN useradd -ms /bin/bash myuser

RUN mkdir -p /home/myuser/app/ && chown -R myuser:myuser /home/myuser/app

WORKDIR /home/myuser/app

USER myuser

COPY *.sh .

COPY --chown=myuser:myuser . .

CMD ["bash", "run.sh"]


