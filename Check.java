package utils;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class Check {


    /**
     * �ж�boolean[] �Ƿ�Ϊ��
     * 
     * @param value
     * @return
     */
    public static boolean isEmpty(final boolean[] value)
    {
        return null == value || value.length == 0;
    }

    public static boolean isEmpty(final byte[] a)
    {
        return null == a || a.length == 0;
    }

    /**
     * �ж�char[] �Ƿ�Ϊ��
     * 
     * @param value
     * @return
     */
    public static boolean isEmpty(final char[] value)
    {
        return null == value || value.length == 0;
    }

    /**
     * �ж��ַ����Ƿ�Ϊ���ַ���
     * 
     * @param s
     *            �ַ���(������null)
     * @return trueΪ��false��Ϊ��
     * 
     */
    public static boolean isEmpty(final CharSequence s)
    {
        return null == s || s.length() == 0;
    }

    /**
     * �ж�CharSequence[] �Ƿ�Ϊ��
     * 
     * @param value
     * @return
     */
    public static boolean isEmpty(final CharSequence[] value)
    {
        return null == value || value.length == 0;
    }

    /**
     * �ж�collection�Ƿ�Ϊ�ռ���
     * 
     * @param collection
     *            �жϵļ���
     * @return trueΪ��,false��Ϊ��
     * 
     */
    // Ϊ�˷�ֹ unchecked ���뾯���ר�����õĺ���
    public static boolean isEmpty(final Collection<?> collection)
    {
        return null == collection || collection.size() == 0;
    }

    public static boolean isEmpty(final Date time)
    {
        return null == time || 0 == time.getTime() || -28800000L == time.getTime();
    }

    /**
     * �ж�int�������Ƿ�Ϊ��
     * 
     * @param a
     *            ����(������null)
     * @return trueΪ��,false��Ϊ��
     * 
     */
    public static boolean isEmpty(final int[] a)
    {
        return null == a || a.length == 0;
    }

    /**
     * �ж�Integer���������Ƿ�Ϊ������
     * 
     * @param a
     *            �ַ���(������null)
     * @return trueΪ��false��Ϊ��
     * 
     */
    public static boolean isEmpty(final Integer[] a)
    {
        return null == a || a.length == 0;
    }

    /**
     * �ж�long�������Ƿ�Ϊ��
     * 
     * @param a
     *            ����(������null)
     * @return trueΪ�� false��Ϊ��
     * 
     */
    public static boolean isEmpty(final long[] a)
    {
        return null == a || a.length == 0;
    }

    public static boolean isEmpty(final Long[] a)
    {
        return null == a || a.length == 0;
    }

    /**
     * �ж�Map�Ƿ�Ϊ��ӳ��
     * 
     * @param map
     *            �жϵ�ӳ��
     * @return trueΪ��,false��Ϊ��
     * 
     */
    // Ϊ�˷�ֹ unchecked ���뾯���ר�����õĺ���
    public static boolean isEmpty(final Map<?, ?> map)
    {
        return null == map || map.size() == 0;
    }

    public static boolean isEmpty(final Object[] a)
    {
        return null == a || a.length == 0;
    }

    /**
     * �ж��ַ����Ƿ�Ϊ���ַ���
     * 
     * @param s
     *            �ַ���(������null)
     * @return trueΪ��false��Ϊ��
     * 
     */
    public static boolean isEmpty(final String s)
    {
        return null == s || s.length() == 0;
    }

    /**
     * �ж��ַ��������Ƿ�Ϊ������
     * 
     * @param a
     *            �ַ���(������null)
     * @return trueΪ��false��Ϊ��
     * 
     */
    public static boolean isEmpty(final String[] a)
    {
        return null == a || a.length == 0;
    }

    /**
     * �ж��ַ����Ƿ���11λ���֣��ֻ��ţ�
     * 
     * @param mobile
     * @return
     */
    public static boolean isMobile(final String mobile)
    {
        if (NumberUtil.isNumeric(mobile) && mobile.length() == 11)
        {
            return true;
        }
        return false;
    }

    /**
     * ��֤�Ƿ��ֻ����루��Ӣ�Ķ��Ż�ֺŷָ���
     * 
     * @param mobiles
     *            �ֻ�����
     * @return
     */
    public static boolean isMobiles(final String mobiles)
    {
        final String[] mobs = mobiles.split(",|;|��|��");
        if (Check.isEmpty(mobs))
        {
            return false;
        }
        for (final String mob : mobs)
        {
            if (!isMobile(mob))
            {
                return false;
            }
        }
        return true;
    }

    /**
     * �ж�boolean[] �Ƿ�ǿ�
     * 
     * @param value
     * @return
     */
    public static boolean notEmpty(final boolean[] value)
    {
        return null != value && value.length > 0;
    }

    /**
     * �ж�byte[] �Ƿ�Ϊ��
     * 
     * @param value
     * @return
     */
    public static boolean notEmpty(final byte[] value)
    {
        return null != value && value.length > 0;
    }

    /**
     * �ж�char[] �Ƿ�ǿ�
     * 
     * @param value
     * @return
     */
    public static boolean notEmpty(final char[] value)
    {
        return null != value && value.length > 0;
    }

    /**
     * �ж��ַ����Ƿ�ǿ�
     * 
     * @param s
     *            �ַ���(������null)
     * @return true��Ϊ��,falseΪ��
     * 
     */
    public static boolean notEmpty(final CharSequence s)
    {
        return null != s && s.length() > 0;
    }

    /**
     * �ж�CharSequence[] �Ƿ�ǿ�
     * 
     * @param value
     * @return
     */
    public static boolean notEmpty(final CharSequence[] value)
    {
        return null != value && value.length > 0;
    }

    /**
     * �ж�Collection�Ƿ�ǿ�
     * 
     * @param collection
     *            ����
     * @return ture���ϲ�Ϊ��,false����Ϊ��
     * 
     */
    // Ϊ�˷�ֹ unchecked ���뾯���ר�����õĺ���
    public static boolean notEmpty(final Collection<?> collection)
    {
        return null != collection && collection.size() > 0;
    }

    public static boolean notEmpty(final Date time)
    {
        return null != time && 0 != time.getTime() && -28800000L != time.getTime();
    }

    /**
     * �ж�int�������Ƿ�ǿ�
     * 
     * @param a
     *            ����(������null)
     * @return true���鲻Ϊ��,false����Ϊ��
     * 
     */
    public static boolean notEmpty(final int[] a)
    {
        return null != a && a.length > 0;
//        return true;    
    }

    /**
     * �ж�Integer���������Ƿ�ǿ�
     * 
     * @param a
     *            ����(������null)
     * @return true��Ϊ��falseΪ��
     * 
     */
    public static boolean notEmpty(final Integer[] a)
    {
        return null != a && a.length > 0;
    }

    /**
     * �ж�long�������Ƿ�ǿ�
     * 
     * @param a
     *            ����(������null)
     * @return true���鲻Ϊ��false����Ϊ��
     * 
     */
    public static boolean notEmpty(final long[] a)
    {
        return null != a && a.length > 0;
    }

    public static boolean notEmpty(final Long[] a)
    {
        return null != a && a.length > 0;
    }

    /**
     * �ж�Map�Ƿ�ǿ�
     * 
     * @param map
     *            ӳ��
     * @return tureӳ�䲻Ϊ��,falseӳ��Ϊ��
     * 
     */
    // Ϊ�˷�ֹ unchecked ���뾯���ר�����õĺ���
    public static boolean notEmpty(final Map<?, ?> map)
    {
        return null != map && map.size() > 0;
    }

    /**
     * �ж�Object[] �Ƿ�ǿ�
     * 
     * @param value
     * @return
     */
    public static boolean notEmpty(final Object[] value)
    {
        return null != value && value.length > 0;
    }

    /**
     * �ж��ַ����Ƿ�ǿ�
     * 
     * @param s
     *            �ַ���(������null)
     * @return true�ַ�����Ϊ��,false�ַ���Ϊ��
     * 
     */
    public static boolean notEmpty(final String s)
    {
        return null != s && s.length() > 0;
    }

    /**
     * �ж��ַ��������Ƿ�ǿ�
     * 
     * @param a
     *            ����(������null)
     * @return true���鲻Ϊ��false����Ϊ��
     * 
     */
    public static boolean notEmpty(final String[] a)
    {
        return null != a && a.length > 0;
    }

    /**
     * ˽�й��캯��
     */
    private Check()
    {

    }

}
